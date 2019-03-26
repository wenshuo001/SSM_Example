package com.ws.web;

import com.alibaba.fastjson.JSONObject;
import com.ws.bean.AppVersion;
import com.ws.service.AppVersionService;
import com.ws.util.JsonResult;
import com.ws.util.fastJsonConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AppVersionControll {

    @Autowired
    private AppVersionService appVersionService;

    @ResponseBody
    @GetMapping("teacherVersion")
    public String getTeacherVersion(int app_is_beta, int pageNum) {
        JsonResult result=new JsonResult();
        result.setCode("200");
        result.setMsg("成功");
        result.setData(appVersionService.getTeacherVersion(1,1));
        return JSONObject.toJSONString(result);
    }


    public void getParentsVersion(int app_is_beta, int pageNum) {

    }
}
