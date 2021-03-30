package main;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println("10001st Prime");
		Calculator cal = new Calculator();
		int result = cal.calculateNumberPrime(10001);
		System.out.println("10001st prime: " + result);
	}

}
