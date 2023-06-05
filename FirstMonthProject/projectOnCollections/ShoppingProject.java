package com.full.projectOnCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShoppingProject {

	static List<Product> products = Admin.products;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int choice;
		int user;
		boolean close = true;
		initializeProducts();
		System.out.println("User Or Admin \nOptions: \n1 for User \n2 for Admin");
		System.out.println("Enter the Choice");
		user = scanner.nextInt();

		do {
			switch (user) {
			// User Functionality
			case 1:

				User.user();

				break;
			// Admin Functionality
			case 2: {
				Admin.admin();
				break;
			}

			default: {
				System.out.println("Enter the available option");
				close = false;
				break;
			}
			}
		} while (close);

	}

	private static void initializeProducts() {
		products = new ArrayList<>();
		products.add(new Product("Horlicks", 10.0, 2));
		products.add(new Product("Boost", 20.0, 3));
		products.add(new Product("Complan", 30.0, 5));
		products.add(new Product("BournVita", 30.0, 5));

	}

//to display products

}
