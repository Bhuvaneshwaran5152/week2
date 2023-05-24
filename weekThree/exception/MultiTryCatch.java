package com.full.weekThree.exception;

public class MultiTryCatch {
	static String name = null;

	public static void main(String[] args) {
		try {
			System.out.println(name);
			// try {

			// } catch (NullPointerException e) {

			// System.out.println(e.getMessage());
			// }
		} catch (ArithmeticException e) {

		} catch (Exception e) {

		} catch (Throwable e) {
			// TODO: handle exception
		}
		try {
			System.out.println(name.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString() + " hello");
			System.err.println(e.getLocalizedMessage());
		} finally {
			System.out.println("Finally block");
		}
	}

}
