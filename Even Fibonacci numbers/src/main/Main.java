package main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		System.out.println("Even Fibonacci numbers");
		System.out.println("Adding up all fibonacci numbers below 4 million");
		Calculator cal = new Calculator();
		
		FibonacciNumber maximumFibonacciNumber = new FibonacciNumber();
		maximumFibonacciNumber.setFibonacciNumber(new BigInteger("4000000"));
		
		cal.calculateTheSumForFibonacciTotalWhoseValueDoesNotExceed(maximumFibonacciNumber);
	}

}
