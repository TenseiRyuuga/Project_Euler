package main;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Multiples of 3 and 5");
		System.out.println("Adding up all numbers below 1000 which are dividable by 3 and 5");
		Calculator cal = new Calculator();
		
		BigInteger three = BigInteger.valueOf(3L);
		BigInteger five = BigInteger.valueOf(5L);
		
		ArrayList<BigInteger> multipleOfs = new ArrayList<>();
		multipleOfs.add(three);
		multipleOfs.add(five);
		
		BigInteger maxNumber = BigInteger.valueOf(1000L);
		
		BigInteger result = cal.totalForTheNumberBelowAndMultipleOfs(maxNumber, multipleOfs);
		System.out.println("Result: " + result);
	}

}
