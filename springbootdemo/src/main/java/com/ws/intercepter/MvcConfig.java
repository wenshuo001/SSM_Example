package com.ws.intercepter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    //添加拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 拦截一切路径
//        registry.addInterceptor(new MyIntercepter()).addPathPatterns("/*.do");
//    }

    /**
     * 添加静态资源--
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //配置静态资源处理
        //替换成修改后url访问的路径
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/META-INF/resources/")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/static/");
    }
}




