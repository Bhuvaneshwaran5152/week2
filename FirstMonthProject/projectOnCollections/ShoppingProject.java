package com.full.projectOnCollections;

import java.util.List;
import java.util.Scanner;

public class ShoppingProject {

	public static void main(String[] args) {
		Admin admin = new Admin();
		List<Product> products = admin.getProduct();
		User userObject = new User();
		Scanner scanner = new Scanner(System.in);

		int user;
		boolean close = true;

		System.out.println("User Or Admin \nOptions: \n1 for User \n2 for Admin");
		System.out.println("Enter the Choice");
		user = scanner.nextInt();

		do {
			switch (user) {
			// User Functionality
			case 1:

				userObject.user();

				break;
			// Admin Functionality
			case 2: {
				admin.admin();
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

}
