package com.example.pao_lab2_e2.model;

import java.math.BigDecimal;

public class Beer extends Product{
    private BigDecimal precentage;

    public Beer(int id, String name, BigDecimal precentage) {
        super(id, name);
        this.precentage = precentage;
    }
}
