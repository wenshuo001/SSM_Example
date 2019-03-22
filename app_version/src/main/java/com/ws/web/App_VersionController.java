package com.ws.web;

import com.ws.service.AppVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App_VersionController {

    private AppVersionService service;

    @RequestMapping(value = "/all_appversion.html")
    public String getAllAppVersion(){

        service.queryAllApp();
        return "all_app";
    }

    @Autowired
    public void setService(AppVersionService service) {
        this.service = service;
    }
}
