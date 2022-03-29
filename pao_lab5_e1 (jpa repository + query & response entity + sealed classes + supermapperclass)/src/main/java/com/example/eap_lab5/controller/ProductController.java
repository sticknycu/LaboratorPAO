package com.example.eap_lab5.controller;

import com.example.eap_lab5.entities.Product;
import com.example.eap_lab5.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ProductController {

    public final ProductService productService;

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.listProducts();
    }

    @GetMapping("/product/{name}")
    public ResponseEntity<Product> findProductByName(@PathVariable String name){
        var p = productService.findProductByName(name);
        /*if ( p == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.of(Optional.of(p));*/
        if ( p.isPresent()){
            return ResponseEntity.of(p);
        }
        return ResponseEntity.noContent().build();
    }
}
