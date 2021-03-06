package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.OrdersDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersDao ordersDao;

    @Override
    public Orders findById(String ordersId) throws Exception{
        Orders order = ordersDao.findById(ordersId);
        return order;
    }

    @Override
    public List<Orders> findAll(int page,int size) throws Exception{

        PageHelper.startPage(page,size);
        List<Orders> ordersList = ordersDao.findAll();
        return ordersList;
    }
}
