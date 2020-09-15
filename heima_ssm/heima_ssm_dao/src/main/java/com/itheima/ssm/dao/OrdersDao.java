package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrdersDao {

    //column数据库列名，property实体类属性名
    @Select("Select * from orders where id=#{ordersId}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "ordersNum",property = "ordersNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "orderStatus",property = "orderStatus"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "productId",property = "product",javaType = Product.class,one = @One(select = "com.itheima.ssm.dao.IProductDao.findById")),
            @Result(column = "memberId",property = "member",javaType = Member.class,one = @One(select = "com.itheima.ssm.dao.MemberDao.findById")),
            @Result(column = "id",property = "travellers",javaType = java.util.List.class,many = @Many(select = "com.itheima.ssm.dao.TravellerDao.findByOrdersId"))

    })
    public Orders findById(String ordersId) throws Exception;

    @Select("select * from orders")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column = "ordersNum",property = "ordersNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "orderStatus",property = "orderStatus"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "productId",property = "product",javaType = Product.class,one = @One(select = "com.itheima.ssm.dao.IProductDao.findById"))

    })
    public List<Orders> findAll() throws  Exception;

}
