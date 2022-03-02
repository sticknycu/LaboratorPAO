package com.example.springlaborator2pao.service;

import com.example.springlaborator2pao.model.Product;
import com.example.springlaborator2pao.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void add(Product product) {
        productRepository.add(product);
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
