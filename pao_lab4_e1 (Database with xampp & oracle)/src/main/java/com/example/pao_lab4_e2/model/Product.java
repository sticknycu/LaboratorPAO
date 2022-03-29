package com.example.pao_lab4_e2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Product {

    private int id;
    private String name;
    private BigDecimal price;
}
