package com.bookcity.test;

import com.bookcity.dao.OrderDao;
import com.bookcity.dao.impl.OrderDaoImpl;
import com.bookcity.pojo.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDaoTest {

    @Test
    public void saveOrder() {

        OrderDao orderDao = new OrderDaoImpl();

        orderDao.saveOrder(new Order("1234567891",new Date(),new BigDecimal(100),0, 1));

    }
}