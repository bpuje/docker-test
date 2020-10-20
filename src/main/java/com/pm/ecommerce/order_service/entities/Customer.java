package com.pm.ecommerce.order_service.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Customer {

    private String customerNumber;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Address address;
}
