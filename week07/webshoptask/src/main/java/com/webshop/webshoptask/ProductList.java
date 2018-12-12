package com.webshop.webshoptask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ProductList {

  private List<Product> productList;

  public ProductList() {

    productList = new ArrayList<>();

    productList.add(new Product("Running Shoes", "Nike running shoes for every day sport", 1000,5));
    productList.add(new Product("Printer", "HP printer to kill the environment", 3000,2));
    productList.add(new Product("Coca Cola", "0.5 liter coke", 25,0));
    productList.add(new Product("Wokin", "Chicken with fried rice and WOKIN sauce", 119,100));
    productList.add(new Product("T-shirt", "Blue with corgi on a bike", 300,1));
  }

  public List<Product> getProductList() {
    return productList;
  }

  public List<Product> availableStock() {
    return productList
            .stream()
            .filter(p -> p.getStock() > 0)
            .collect(toList());
  }

  public List<Product> cheapestFirst() {
    return productList
            .stream()
            .sorted(Comparator.comparing(Product::getPrice))
            .collect(toList());
  }

  public List<Product> containsNike() {
    return productList
            .stream()
            .filter(p -> p.getDescription().contains("Nike"))
            .collect(toList());
  }

  public String averageStock() {
    return "The average stock is " + productList
            .stream()
            .mapToDouble(Product::getStock)
            .sum() / productList.size();
  }

  public String theMostExpensive() {
    return "The most expensive product is " + productList
            .stream()
            .max(Comparator.comparing(Product::getPrice))
            .get().getName();
  }
  public List<Product> searchBari(String searchText) {
    return productList
            .stream()
            .filter(p -> p.getDescription().contains(searchText))
            .collect(toList());
  }
}
