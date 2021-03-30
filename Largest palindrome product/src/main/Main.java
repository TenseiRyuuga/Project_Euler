package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("Largest palindrome product");
		Calculator cal = new Calculator();
		int result = cal.calculateBiggestPalindromeOfTwo3DigitNumbers();
		System.out.println("The largest palindrome product of 3 digit numbers is: " + result);

	}

}
