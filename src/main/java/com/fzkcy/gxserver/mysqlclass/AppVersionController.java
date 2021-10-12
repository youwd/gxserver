package com.fzkcy.gxserver.mysqlclass;

import java.util.List;

import com.fzkcy.gxserver.model.AppVersion;
import com.fzkcy.gxserver.service.serverimpl.AppVersionServerimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController
@ResponseBody
public class AppVersionController {
    @Autowired
    private AppVersionServerimpl appVersionServer;

    @RequestMapping("/getapplist")
    public List<AppVersion> getAppVersionList(@RequestParam(value = "appname", defaultValue = "") String appname)
    {
      return appVersionServer.getAppVersionList(appname);
    }

    @RequestMapping("/getLastAppVersion")
    public AppVersion getLastAppVersion(@RequestParam(value = "appname", defaultValue = "") String appname)
    {
      return appVersionServer.getAppVersionList(appname).get(0);
    }
}
