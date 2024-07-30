package com.first;

public class StringReverse {

	public static void main(String[] args) {

		System.out.println("Hello World");

		System.out.println("Java Programming");

		String input = "Java Programming";

		String output = " ";

		for (int i = input.length() - 1; i >= 0; i--) {

			char c = input.charAt(i);
			output = output + c;

		}

		System.out.println("Reversed word is :" + output);

	}

}
