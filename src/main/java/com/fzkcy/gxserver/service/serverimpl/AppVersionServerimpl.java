package com.fzkcy.gxserver.service.serverimpl;

import java.util.List;

import com.fzkcy.gxserver.model.AppVersion;
import com.fzkcy.gxserver.mysqlclass.AppVersionMapper;
import com.fzkcy.gxserver.service.AppVersionServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public class AppVersionServerimpl implements AppVersionServer {
    @Autowired
    private AppVersionMapper appVersionMapper;
    @Override
    public List<AppVersion> getAppVersionList(String appname) {
        
        try {
            List<AppVersion> appVersion = appVersionMapper.getAppVersionList(appname);
            
            return  appVersion;
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
