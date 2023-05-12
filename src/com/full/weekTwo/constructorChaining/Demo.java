package com.full.weekTwo.constructorChaining;

public class Demo {
	Integer num;
	String name;
	Double value;
	Boolean status;

	Demo() {
		this(1);
		System.out.println(1);

	}

	Demo(Integer num) {
		this("Bhuvan");

		this.num = num;
		System.out.println(2);

	}

	Demo(String name) {
		this(100000.0);
		this.name = name;
		System.out.println(3);

	}

	public Demo(Integer num, String name, Double value, Boolean status) {
		super();
		this.num = num;
		this.name = name;
		this.value = value;
		this.status = status;
	}

	Demo(Double value) {
		this(true);
		this.value = value;
		System.out.println(4);

	}

	Demo(Boolean status) {
		System.out.println("Success");
		this.status = status;
		System.out.println(5);

	}

}
