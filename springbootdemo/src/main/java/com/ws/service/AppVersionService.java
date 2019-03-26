package com.ws.service;

import com.ws.bean.AppInfo;
import com.ws.bean.AppVersion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppVersionService {

    public List<AppInfo> getTeacherVersion(int app_is_beta,int pageNum);

    public List<AppInfo> getParentsVersion(int app_is_beta, int pageNum);
}
