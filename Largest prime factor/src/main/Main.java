package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Largest prime factor");
		BigInteger number = new BigInteger("600851475143");
		
		Calculator cal = new Calculator();
		BigInteger result = cal.calculateLargestPrimeNumbersFor(number);
		System.out.println("number: " + result);
	}

}
