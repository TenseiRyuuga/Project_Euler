package main;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Smallest multiple");
		Calculator cal = new Calculator();
		int number = 20;
		BigInteger result = cal.calculateSmallestNumberEvenlyDivisibleBy(number);
		System.out.println("Smallest number divisible by all numbers up to " + number + " is " + result);
	}

}
