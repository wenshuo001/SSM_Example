package com.ws.service.impl;

import com.ws.bean.AppInfo;
import com.ws.bean.AppVersion;
import com.ws.mapper.AppInfoMapper;
import com.ws.mapper.AppVersionMapper;
import com.ws.service.AppVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("appVersionService")
public class AppVersionServiceImpl implements AppVersionService {

    @Autowired
    private AppInfoMapper appInfoMapper;
    @Override
    public List<AppInfo> getTeacherVersion(int app_is_beta, int app_isPorT) {

        Example example = new Example(AppInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("appIsBeta", app_is_beta).andEqualTo("appIsport",app_isPorT);
        List<AppInfo> list = appInfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<AppInfo> getParentsVersion(int app_is_beta, int pageNum) {
        return null;
    }
}
