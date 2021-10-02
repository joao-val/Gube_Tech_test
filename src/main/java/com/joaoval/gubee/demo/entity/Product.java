package com.joaoval.gubee.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String productName;
    private String description;
    private ArrayList<String> targetMarket;
    private ArrayList<String> stack;

    public Product() {
    }

    public Product(String productName, String description, ArrayList<String> targetMarket, ArrayList<String> stack) {
        this.productName = productName;
        this.description = description;
        this.targetMarket = targetMarket;
        this.stack = stack;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getTargetMarket() {
        return targetMarket;
    }

    public void setTargetMarket(ArrayList<String> targetMarket) {
        this.targetMarket = targetMarket;
    }

    public ArrayList<String> getStack() {
        return stack;
    }

    public void setStack(ArrayList<String> stack) {
        this.stack = stack;
    }
}
