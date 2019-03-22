package com.ws.dao;


import com.ws.domain.AppVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class App_VersionDao {

    private JdbcTemplate jdbcTemplate;


    private final static String GET_ALL_APP= "select * from app_info";
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<AppVersion> getAllApp(){
        if (jdbcTemplate==null){
            jdbcTemplate=new JdbcTemplate();
        }

        List<AppVersion> appVersionList =jdbcTemplate.queryForList(GET_ALL_APP,AppVersion.class);

        return appVersionList;
    }
}
