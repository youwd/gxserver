package com.fzkcy.gxserver.mysqlclass;

import com.fzkcy.gxserver.model.AppVersion;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface AppVersionMapper {
    @Select("select * from appVersion WHERE appname = #{appname} order by id desc")
    List<AppVersion> getAppVersionList(@Param("appname") String appname);
}
