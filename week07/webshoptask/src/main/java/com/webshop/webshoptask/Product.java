package com.webshop.webshoptask;

public class Product {

  private String name;
  private String description;
  private int price;
  private int stock;

  Product(String name, String description, int price, int stock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.stock = stock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getStock() {
    return stock;
  }
}
