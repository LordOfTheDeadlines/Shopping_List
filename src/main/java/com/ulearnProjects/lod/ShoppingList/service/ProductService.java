package com.ulearnProjects.lod.ShoppingList.service;

import com.ulearnProjects.lod.ShoppingList.model.Product;
import com.ulearnProjects.lod.ShoppingList.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void create(String prName) {
        Product product = new Product(null, prName);
        productRepository.save(product);
    }

    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    public Product find(Long productId){
        return productRepository.findById(productId).get();
    }

    public void remove(Long productId){
        productRepository.deleteById(productId);
    }
}
