package com.Ecommerce.GQT.programs;

public class Product {
    private String name, brand, desc;
    private double price;
    private String color;

    public Product(String name, String brand, String desc, double price, String color) {
        this.name = name;
        this.brand = brand;
        this.desc = desc;
        this.price = price;
        this.color = color;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getBrand() { return brand; }
    public String getDesc() { return desc; }

    public void display() {
        System.out.printf(
            "%-15s %-12s %-12s ₹%.2f%n",
            name, brand, desc, price
        );
    }
}