package com.example.eap_lab5.service;

import com.example.eap_lab5.entities.Product;
import com.example.eap_lab5.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public List<Product> listProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> findProductByName(String name){
        return productRepository.findProductByName(name);
    }
}
