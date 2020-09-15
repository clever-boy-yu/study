package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.SysLogDao;
import com.itheima.ssm.domain.SysLog;
import com.itheima.ssm.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SysLogServiceImpl implements SysLogService{

    @Autowired
    private SysLogDao sysLogDao;

    @Override
    public void savelog(SysLog sysLog) throws Exception {
        sysLogDao.saveLog(sysLog);
    }
}
