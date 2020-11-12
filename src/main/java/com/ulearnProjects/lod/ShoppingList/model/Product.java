package com.ulearnProjects.lod.ShoppingList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Boolean status;

    public Product(){

    }

    public Product(Long id, String name){
        this.id = id;
        this.name = name;
        this.setNotBought();
    }

    public Product(Long id){
        this.id = id;
        this.name = null;
        this.setNotBought();
    }

    public String getName(){
        return name;
    }

    public Long getId(){
        return id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setBought() {
        status = true;
    }

    public void setNotBought(){
        status = false;
    }
}

