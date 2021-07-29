package com.anil.service.services.impl;

import com.anil.service.model.Product;
import com.anil.service.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<String, Product> productRepo = new HashMap<>();
    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("Canon");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product();
        almond.setId("2");
        almond.setName("Nikon");
        productRepo.put(almond.getId(), almond);
    }
    @Override
    public void createProduct(Product product) {
        productRepo.put(product.getId(), product);
    }

    @Override
    public Collection<Product> getProducts() {
        return null;
    }

    @Override
    public void updateProduct(String id, Product product) {

    }

    @Override
    public void deleteProduct(String id) {

    }
}
