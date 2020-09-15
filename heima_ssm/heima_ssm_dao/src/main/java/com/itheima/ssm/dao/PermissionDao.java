package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionDao {

    @Select("select * from permission where id in (select permissionid from role_permission where roleid = #{id})")
    public List<Permission> findByRoleId(String id) throws Exception;
}
