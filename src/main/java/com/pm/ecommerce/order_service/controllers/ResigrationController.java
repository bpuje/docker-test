package com.pm.ecommerce.order_service.controllers;

import com.pm.ecommerce.order_service.entities.Order;
import com.pm.ecommerce.order_service.entities.ApiResponse;
import com.pm.ecommerce.order_service.interfaces.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/register")
public class ResigrationController {

//    @Autowired
//    private IOrderService service;

    @Autowired
    private IOrderService orderService;


    @PostMapping("/orders")
    public ResponseEntity<ApiResponse<Order>> registerOrder(@RequestBody Order postData){
        ApiResponse<Order> response = new ApiResponse<>();
        try {
            Order order = orderService.registerCustomer(postData);
            response.setData(order);
            response.setMessage("Order registered successfully.");
        } catch (Exception e) {
            response.setStatus(500);
            response.setMessage(e.getMessage());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

        return ResponseEntity.ok(response);
    }

//    @PostMapping("/user")
//    public ResponseEntity<ApiResponse<Order>> registerUser(@RequestBody Order postData){
//        ApiResponse<Order> response = new ApiResponse<>();
//        try {
//            Order order = service.registerCustomer(postData);
//            response.setData(order);
//            response.setMessage("User registered successfully.");
//        } catch (Exception e) {
//            response.setStatus(500);
//            response.setMessage(e.getMessage());
//
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
//        }
//
//        return ResponseEntity.ok(response);
//    }
}
