package main;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Sum square difference");
		Calculator cal = new Calculator();
		int number = 100;
		BigInteger result = cal.calculateTheSquareSumDifferenceFor(number);
		System.out.println("The square sum difference for " + number + " is " + result);
	}

}
