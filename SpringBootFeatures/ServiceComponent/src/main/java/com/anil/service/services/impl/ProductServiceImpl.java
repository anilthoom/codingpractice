package com.anil.service.services.impl;

import com.anil.service.model.Product;
import com.anil.service.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public void createProduct(Product product) {

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
