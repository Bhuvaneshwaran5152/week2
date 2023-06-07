package com.full.projectOnCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ShoppingCart {

	private Map<Product, Integer> cartItems;

	Admin admin = new Admin();

	public ShoppingCart() {
		cartItems = new HashMap<>();

	}

//to add items to cart
	public void addItem(Product product, int quantity) {
		int newQuantity = product.getquantity() - quantity;
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

			product.setQunatity(product.getquantity() + quantity);
			cartItems.remove(product);
			System.out.println(product.getName() + " removed from the cart.");

		} else {
			System.out.println("The cart does not contain " + product.getName() + ".");
		}
	}

//TO add quantity
	public void changeQuantity(Product product, int oldQunatity, int newQuantity) {
		product.setQunatity(product.getquantity() + oldQunatity - newQuantity);
		cartItems.replace(product, newQuantity);
		// addItem(product, newQuantity);
	}

//to display cart
	public void displayCart() {
		if (cartItems.isEmpty()) {
			System.out.println("The cart is empty.");
		} else {
			admin.displayProducts();
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
