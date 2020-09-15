package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrdersService {

    public Orders findById(String ordersId) throws Exception;

    public List<Orders> findAll(int page,int size) throws  Exception;

}
