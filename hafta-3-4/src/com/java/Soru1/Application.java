package com.java.Soru1;

import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Product> productList = new LinkedList<Product>();
        productList.add(new Product("Hair Dryer","France"));
        productList.add(new Product("Laptop","USA"));
        productList.add(new Product("Car","Turkey"));

        System.out.println("First product: " + productList.get(0).getName());
        System.out.println("Second product: " + productList.get(1).getName());
        System.out.println("Last product: " + productList.get(2).getName());

	}

}
