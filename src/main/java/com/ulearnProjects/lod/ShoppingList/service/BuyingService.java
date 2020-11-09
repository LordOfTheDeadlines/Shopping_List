package com.ulearnProjects.lod.ShoppingList.service;

import com.ulearnProjects.lod.ShoppingList.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class BuyingService {

    @Autowired
    ProductService productService;

    public boolean  check(Long itemId){
        Product product = productService.find(itemId);
        if(product.isBought())
            product.setNotBought();
        else product.setBought();
        return product.isBought();
    }
}
