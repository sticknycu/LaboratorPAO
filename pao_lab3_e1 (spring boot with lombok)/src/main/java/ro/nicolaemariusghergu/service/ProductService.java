package ro.nicolaemariusghergu.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ro.nicolaemariusghergu.model.Product;
import ro.nicolaemariusghergu.repository.ProductRepository;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }
}
