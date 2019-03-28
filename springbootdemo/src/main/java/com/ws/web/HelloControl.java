package com.ws.web;

import com.alibaba.fastjson.JSONObject;
import com.ws.mapper.AppInfoMapper;
import com.ws.service.AppVersionService;
import com.ws.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloControl {

    //    @Autowired
//    private DataSource dataSource;
    @Autowired
    private AppVersionService appVersionService;


    @GetMapping("hello.do")
    public JsonResult hello() {
        JsonResult result = new JsonResult();
        result.setCode("200");
        result.setMsg("成功");
        result.setData(appVersionService.getTeacherVersion(1, 1));
        return result;
    }

}
