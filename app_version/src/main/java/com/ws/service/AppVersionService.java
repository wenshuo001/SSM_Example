package com.ws.service;


import com.ws.dao.App_VersionDao;
import com.ws.domain.AppVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppVersionService {


	private App_VersionDao versionDao;



    public List<AppVersion> queryAllApp() {
        if(versionDao==null){
			versionDao=new App_VersionDao();
		}
		return versionDao.getAllApp();
	}

	@Autowired
	public void setVersionDao(App_VersionDao versionDao) {
		this.versionDao = versionDao;
	}
}
