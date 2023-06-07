package com.full.projectOnCollections;

import java.util.List;
import java.util.Scanner;

public class User {
	static Admin admin = new Admin();
	private List<Product> products = admin.getProduct();
	private ShoppingCart cart = new ShoppingCart();

	void user() {
		// products = admin.getProduct();
		// List<Product> products = admin.getProduct();
		int userChoice;
		int productNumber;
		int quantity;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\nMenu:\n");
			System.out.println("1. Add item to cart");
			System.out.println("2. Remove item from cart");
			System.out.println("3. Display cart contents");
			System.out.println("4.To increase quantity");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			userChoice = scanner.nextInt();

			switch (userChoice) {
			case 1: {
				displayProducts();
				products = admin.getProduct();

				if (products != null) {

					System.out.print("Enter the product number: ");
					productNumber = scanner.nextInt();
					System.out.print("Enter the quantity: ");
					quantity = scanner.nextInt();
					if (productNumber >= 1 && productNumber <= products.size()) {
						if (products.get(productNumber - 1).getquantity() >= quantity) {
							Product selectedProduct = products.get(productNumber - 1);
							cart.addItem(selectedProduct, quantity);
						} else {
							System.out.println("Check for the quantity");
						}

					} else {
						System.out.println("Invalid product number.");
					}
					break;

				}
			}

			case 2: {
				cart.displayCart();

				System.out.print("Enter the product number: ");
				productNumber = scanner.nextInt();
				System.out.println("Enter the quantity");
				quantity = scanner.nextInt();
				if (productNumber >= 1 && productNumber <= products.size()) {

					Product selectedProduct = products.get(productNumber - 1);
					cart.removeItem(selectedProduct, quantity);

				} else {
					System.out.println("Invalid product number.");
				}
				break;
			}
			case 3: {
				cart.displayCart();
				break;
			}
			case 5: {
				System.out.println("Exiting...\n");
				ShoppingProject.main(null);
				break;
			}
			case 4: {
				cart.displayCart();
				System.out.print("Enter the product number: ");
				productNumber = scanner.nextInt();
				System.out.println("Enter the Existing Quantity");
				int existingQuantity = scanner.nextInt();
				System.out.println("Available Quantity -" + products.get(productNumber - 1).getquantity());
				System.out.println("Enter the New Quantity");
				int newQuantity = scanner.nextInt();
				if (products.get(productNumber - 1).getquantity() + existingQuantity >= newQuantity) {
					cart.changeQuantity(products.get(productNumber - 1), existingQuantity, newQuantity);
				} else {
					System.out.println("Sufficient quantity not available");
				}
				break;
			}

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (userChoice > 4);

	}

	void displayProducts() {
		System.out.println("\nAvailable Products:");
		try {
			for (int i = 0; i < products.size(); i++) {
				Product product = products.get(i);
				System.out.println((i + 1) + ". " + product.getName() + " - Rs." + product.getPrice() + " "
						+ product.getquantity());

			}
		} catch (Exception e) {
			System.out.println("No products to display \n--------Initialize the product first--------");
		}
	}
}