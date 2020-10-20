package com.pm.ecommerce.order_service.interfaces.services;

import com.pm.ecommerce.order_service.entities.Order;

public interface IOrderService {
    public Order registerCustomer(Order order);
}
