package com.ws.mapper;


import com.ws.bean.AppVersion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppVersionMapperTest {

    @Autowired
    private AppVersionMapper appVersionMapper;

    @Test
    public void testQuery(){
       List<AppVersion> version = appVersionMapper.selectAll();
        System.out.println("app_info"+version.toString());
    }

}
