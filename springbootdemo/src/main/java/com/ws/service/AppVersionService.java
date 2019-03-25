package com.ws.service;

import com.ws.bean.AppVersion;

import java.util.List;

public interface AppVersionService {

    public List<AppVersion> getTeacherVersion(int app_is_beta,int pageNum);

    public List<AppVersion> getParentsVersion(int app_is_beta,int pageNum);
}
