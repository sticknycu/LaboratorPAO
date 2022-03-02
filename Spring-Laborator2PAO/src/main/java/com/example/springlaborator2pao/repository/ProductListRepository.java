package com.example.springlaborator2pao.repository;

import com.example.springlaborator2pao.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListRepository implements ProductRepository{

    List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
