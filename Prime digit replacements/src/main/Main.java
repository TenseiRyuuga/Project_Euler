package main;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Prime digit replacement");
		Calculator cal = new Calculator();
		
		// there is no input as we're not limited in what we can do to get the desired result
		BigInteger result = cal.calculateSmallestPrimeWith8PrimeFamily();
		System.out.println("Smallest Prime with 8 value family: " + result);
	}

}
