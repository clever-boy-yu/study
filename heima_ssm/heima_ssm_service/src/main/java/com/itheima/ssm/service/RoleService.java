package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAll() throws Exception;

    public void saveRole(Role role) throws Exception;
}
