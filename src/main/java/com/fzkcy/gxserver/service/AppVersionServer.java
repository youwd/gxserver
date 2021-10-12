package com.fzkcy.gxserver.service;

import java.util.List;

import com.fzkcy.gxserver.model.AppVersion;

import org.springframework.stereotype.Service;

@Service
public interface AppVersionServer {
    List<AppVersion> getAppVersionList(String appname);
}
