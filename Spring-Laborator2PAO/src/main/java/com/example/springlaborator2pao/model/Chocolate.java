package com.example.springlaborator2pao.model;

import java.math.BigDecimal;

public class Chocolate extends Product {

    private String kt;

    Chocolate(BigDecimal id, String name, String kt) {
        super(id, name);
        this.kt = kt;
    }
}
