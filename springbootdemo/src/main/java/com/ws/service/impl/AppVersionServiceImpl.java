package com.ws.service.impl;

import com.ws.bean.AppVersion;
import com.ws.mapper.AppVersionMapper;
import com.ws.service.AppVersionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppVersionServiceImpl implements AppVersionService {

    @Autowired
    private AppVersionMapper appVersionMapper;

    @Override
    public List<AppVersion> getTeacherVersion(int app_is_beta, int pageNum) {
       // List<AppVersion>  appVersions= appVersionMapper.

        return null;
    }

    @Override
    public List<AppVersion> getParentsVersion(int app_is_beta, int pageNum) {
        return null;
    }
}
