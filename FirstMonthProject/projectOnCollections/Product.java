package com.full.projectOnCollections;

class Product {
	private String name;
	private double price;
	private int qunatity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.qunatity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getquantity() {
		return qunatity;
	}

	public void setQunatity(int newQuantity) {
		this.qunatity = newQuantity;
	}
}
