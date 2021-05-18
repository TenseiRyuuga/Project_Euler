package main;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Summation of primes");
		Calculator cal = new Calculator();
		int number = 2000000;
		BigInteger result = cal.calculateSummationOfPrimesBelow(number);
		System.out.println("Summation of primes below " + number + ": " + result);
	}

}
