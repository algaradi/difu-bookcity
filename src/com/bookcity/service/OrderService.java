package com.bookcity.service;

import com.bookcity.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart, Integer userId);
}
