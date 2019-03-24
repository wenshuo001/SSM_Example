package com.ws.web;

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

    @GetMapping("hello.do")
    public String hello(){

        return "hello Spring-Boot";
    }

}
