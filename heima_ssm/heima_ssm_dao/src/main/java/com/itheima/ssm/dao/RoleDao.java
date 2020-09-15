package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoleDao {

    @Select("select * from role where id in (select roleid from user_role where userid = #{userId})")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "roleName",property = "roleName"),
            @Result(column = "roleDesc",property = "roleDesc"),
            @Result(column = "id",property = "permissions",javaType = java.util.List.class,many = @Many(select = "com.itheima.ssm.dao.PermissionDao.findByRoleId"))
    })
    public List<Role> findRoleByUserId(String userId) throws Exception;

    @Select("select * from role")
    public List<Role> findAll() throws Exception;

    @Insert("insert into role(rolename,roledesc) values(#{roleName},#{roleDesc})")
    public void saveRole(Role role) throws Exception;

}
