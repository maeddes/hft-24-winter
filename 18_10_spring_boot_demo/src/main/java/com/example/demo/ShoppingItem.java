package com.example.demo;

public class ShoppingItem {
    private String name;
    private int amount;

    // Constructors
    public ShoppingItem() {}

    public ShoppingItem(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
