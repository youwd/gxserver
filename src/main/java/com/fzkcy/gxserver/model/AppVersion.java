package com.fzkcy.gxserver.model;

public class AppVersion {
    public int id;
    public String appname;
    public String appUrl;
    public String version;
    public String updateDesp;
    public String updateTime;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAppname() {
        return appname;
    }
    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAppUrl() {
        return appUrl;
    }
    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public String getUpdateDesp() {
        return updateDesp;
    }
    public void setUpdateDesp(String updateDesp) {
        this.updateDesp = updateDesp;
    }

    public String getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



}
