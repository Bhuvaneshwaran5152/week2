package com.full.weekTwo.ex3;

public class MainClass {
	public static void main(String[] args) {
		Y.staticMethod();
		X y = new Y();
		y.staticMethod();
		Y x = new Y();
		x.staticMethod();
	}
}
