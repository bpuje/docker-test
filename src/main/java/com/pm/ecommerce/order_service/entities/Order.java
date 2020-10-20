package com.pm.ecommerce.order_service.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "oorder")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private String password;

    public Order() {

    }
}
