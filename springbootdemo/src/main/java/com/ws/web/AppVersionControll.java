package com.ws.web;

import com.ws.service.AppVersionService;
import com.ws.util.JsonResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class AppVersionControll {

    @Autowired
    private AppVersionService appVersionService;

    @ResponseBody
    @GetMapping("app_version")
    public JsonResult getTeacherVersion(String data) {
        JsonResult result=new JsonResult();
        result.setCode("200");
        result.setMsg("成功");
        result.setData(appVersionService.getTeacherVersion(1,1));
        System.out.println("成功lalalalala");
        return result;
    }


//    @ResponseBody
//    @RequestMapping("app_version")
//    public JsonResult getTeacherVersion(@RequestBody Map<String, Object> params) {
//        JsonResult result=new JsonResult();
//        result.setCode("200");
//        result.setMsg("成功");
//        result.setData(appVersionService.getTeacherVersion(Integer.parseInt(params.get("app_is_beta")+""),Integer.parseInt(params.get("app_isPorT")+"")));
//        return result;
//    }
}
