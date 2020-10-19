package com.pm.ecommerce.order_service.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    private Date date;

//    private String status;

//    private Customer customer;

    private String name;

    private String email;

    private String password;

    public Order() {
    }

}
