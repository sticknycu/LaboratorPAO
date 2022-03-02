package com.example.springlaborator2pao.model;

import java.math.BigDecimal;

public class Beer extends Product {

    private int value;

    public Beer(BigDecimal id, String name, int value) {
        super(id, name);
        this.value = value;
    }
}
