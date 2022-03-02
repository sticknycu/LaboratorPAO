package com.example.springlaborator2pao.repository;

import com.example.springlaborator2pao.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    void add(Product product);

    List<Product> getAll();
}
