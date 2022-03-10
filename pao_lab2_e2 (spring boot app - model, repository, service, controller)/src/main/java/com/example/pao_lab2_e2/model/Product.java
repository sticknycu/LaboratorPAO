package com.example.pao_lab2_e2.model;

public abstract class Product {
    protected int id;
    String name;


    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
