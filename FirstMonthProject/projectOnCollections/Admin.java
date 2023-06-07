package com.full.projectOnCollections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Admin {
	private static List<Product> products;

	public List<Product> getProduct() {
		return products;
	}

	void admin() {

		Scanner scanner = new Scanner(System.in);
		int AdminChoice;
		do {
			System.out.println("\n1.Initialize the Products");
			System.out.println("2.Display the available products");
			System.out.println("3.Update quantity of the Product");
			System.out.println("4.Delete the product");
			System.out.println("5.Exit \nEnter your choice Admin");

			AdminChoice = scanner.nextInt();
			switch (AdminChoice) {
			case 1: {
				System.out.println("\nEnter the number of Products to be added");
				int numOfProducts = scanner.nextInt();
				products = new LinkedList<>();
				for (int i = 0; i < numOfProducts; i++) {
					System.out.println("Enter the product name");
					String name = scanner.next();
					System.out.println("Enter the price of the product");
					double price = scanner.nextDouble();
					System.out.println("Enter the quantity");
					int qty = scanner.nextInt();
					Product product = new Product(name, price, qty);
					products.add(i, product);

				}

				break;

			}
			case 2: {
				displayProducts();
				break;
			}
			case 3: {
				displayProducts();
				System.out.println("Select the product to increase quantity");
				int Id = scanner.nextInt();
				System.out.println("Enter the quantity");
				int newQuantity = scanner.nextInt();
				try {
					Product product = products.get(Id - 1);
					double getquantity = product.getquantity();
					product.setQunatity(newQuantity);
					System.out.println("Updated");
					displayProducts();
				} catch (Exception e) {
					System.out.println("\n\nPlease select the available product");
				}

				break;
			}
			case 5: {
				System.out.println("Exiting...\n");
				ShoppingProject.main(null);
				break;
			}
			case 4: {
				displayProducts();
				System.out.println("Select the Product to be deleted");
				int selectedProduct = scanner.nextInt();
				Product product = products.get(selectedProduct - 1);
				if (product != null) {
					products.remove(product);
					System.out.println("Product Deleted");
					displayProducts();

				} else {
					System.out.println("Already Item unavailable");
				}
				break;
			}
			default:
				System.out.println("Invalid choice. Please try again.");

			}
		} while (AdminChoice != 0);

	}

	void displayProducts() {
		System.out.println("\nAvailable Products:");
		try {
			for (int i = 0; i < products.size(); i++) {
				Product product = products.get(i);
				System.out.println((i + 1) + ". " + product.getName() + " - Rs. " + product.getPrice()
						+ "  Available Quantity-" + product.getquantity());

			}
		} catch (Exception e) {
			System.out.println("No products to display \n--------Initialize the product first--------");
		}

	}
}
