package com.full.weekTwo.ex1;

public class M {
	int i = 51;

	public M(int j) {
		System.out.println(i);
		this.i = j * 10;
	}
}

class N extends M {

	public N(int j) {
		super(j);
		System.out.println(i);
		this.i = j * 20;
	}

}
