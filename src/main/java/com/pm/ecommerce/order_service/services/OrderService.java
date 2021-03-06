package com.pm.ecommerce.order_service.services;

import com.pm.ecommerce.order_service.entities.Order;
import com.pm.ecommerce.order_service.interfaces.services.IOrderService;
import com.pm.ecommerce.order_service.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderRepository repository;

    public Order registerCustomer(Order order){
        return repository.save(order);
    }
}
