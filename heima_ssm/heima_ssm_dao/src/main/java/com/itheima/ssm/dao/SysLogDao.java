package com.itheima.ssm.dao;

import com.itheima.ssm.domain.SysLog;
import org.apache.ibatis.annotations.Insert;


public interface SysLogDao {

    @Insert("insert into syslog(visittime,username,ip,url,executiontime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    public void saveLog(SysLog sysLog) throws Exception;
}
