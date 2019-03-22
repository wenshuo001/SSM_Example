package java;


import com.ws.domain.AppVersion;
import com.ws.service.AppVersionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class App_VersionControllerTest {



    AppVersionService  service;

    @Autowired
    public void setService(AppVersionService service) {
        this.service = service;
    }

    @Test
    public void queryAllApp() {
        List<AppVersion>  appVersionList= service.queryAllApp();
        System.out.println();
    }
}
