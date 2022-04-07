package com.anyquiz.quizmaker;

public class Test {
	static int i = 10;

	// static method
	void m1() {
		System.out.println("from m1");
	}

	// static block
	static {
		System.out.println("Static block initialized.");

	}

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");

		s2 = s2.intern();
		System.out.println(s1 == s2);
	}

}