package ro.nicolaemariusghergu.repository;

import org.springframework.stereotype.Repository;
import ro.nicolaemariusghergu.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }
}
