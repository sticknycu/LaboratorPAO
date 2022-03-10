package com.example.pao_lab2_e2.controller;

import com.example.pao_lab2_e2.model.Beer;
import com.example.pao_lab2_e2.model.Chocolate;
import com.example.pao_lab2_e2.model.Product;
import com.example.pao_lab2_e2.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/get-products")
    public List<Product> getAll() {
        return productService.getProducts();
    }

    @PostMapping("/add-beer")
    public void addBeer(@RequestBody Beer beer) {
        productService.add(beer);
    }

    @PostMapping("/add-chocolate")
    public void addChocolate(@RequestBody Chocolate chocolate) {
        productService.add(chocolate);
    }
}
