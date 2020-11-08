package com.ulearnProjects.lod.ShoppingList.model;

public class Product {
    private final String name;
    private boolean bought;

    public Product(String name) {
        this.name = name;
        bought = false;
    }

    public String getName() {
        return name;
    }

    public boolean isBought() {
        return bought;
    }
}
