package com.full.projectOnCollections;

class Product {
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getquantity() {
		return quantity;
	}

	public void setQunatity(int newQuantity) {
		this.quantity = newQuantity;
	}
}
