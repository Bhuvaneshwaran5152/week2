package com.full.projectOnCollections;

import java.util.HashMap;
import java.util.Map;

class ShoppingCart {

	private Map<Product, Integer> cartItems;

	public ShoppingCart() {
		cartItems = new HashMap<>();

	}

//to add items to cart
	public void addItem(Product product, int quantity) {
		int newQuantity = (int) product.getquantity() - quantity;
		product.setQunatity(newQuantity);
		if (cartItems.containsKey(product)) {
			cartItems.put(product, quantity);
		} else {
			cartItems.put(product, quantity);
		}
		System.out.println(quantity + " " + product.getName() + "(s) added to the cart.");
	}

//to remove items from cart
	public void removeItem(Product product, int quantity) {
		if (cartItems.containsKey(product)) {
			int existingQuantity = cartItems.get(product);
			System.out.println("exist " + existingQuantity);

			if (existingQuantity >= quantity) {
				cartItems.remove(product);
				System.out.println(product.getName() + " removed from the cart.");
			} else {
				System.out.println("Enter the proper quantity");
			}
		} else {
			System.out.println("The cart does not contain " + product.getName() + ".");
		}
	}

//to display cart
	public void displayCart() {
		if (cartItems.isEmpty()) {
			System.out.println("The cart is empty.");
		} else {

			System.out.println("Cart Contents:");
			for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
				Product product = entry.getKey();
				int quantity = entry.getValue();
				System.out.println(product.getName() + " - " + quantity + " - $" + product.getPrice() * quantity + "-"
						+ "Quantity -" + quantity);
			}
		}
	}
}
