package com.example.springlaborator2pao.model;

import java.math.BigDecimal;

public abstract class Product {

    protected BigDecimal id;
    protected String name;

    Product(BigDecimal id, String name) {
        this.id = id;
        this.name = name;
    }
}
