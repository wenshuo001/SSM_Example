package com.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ws.mapper")
public class BootApplication {

    public static void main(String[] args){
        SpringApplication.run(BootApplication.class,args);
    }

}
