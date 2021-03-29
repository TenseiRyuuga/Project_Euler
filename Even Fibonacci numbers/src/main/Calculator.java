package main;

import java.math.BigInteger;

public class Calculator {
	FibonacciNumber fi1 = new FibonacciNumber();
	FibonacciNumber fi2 = new FibonacciNumber();
	FibonacciNumber newFibonacciNumber = new FibonacciNumber();
	FibonacciNumber fiSum = new FibonacciNumber();
	
	public FibonacciNumber calculateTheSumForFibonacciTotalWhoseValueDoesNotExceed(FibonacciNumber maximumFibonacciTotalValue) {
		fi2.add(FibonacciNumber.ONE);
		printValues();
		
		// add the two fibonacci numbers to create the newFibonacciNumber and check if it doesn't exceed the maximum value
		while (maximumFibonacciTotalValue.compareTo(fi1.add(fi2)) > -1) {	
			// move the new value to the temporary newFibonacciNumber
			newFibonacciNumber.setFibonacciNumber(fi1);
			// add the newFibonacciNumber to the total sum we have so far
			
			if(newFibonacciNumber.asBigInteger().divideAndRemainder(BigInteger.TWO)[1].equals(BigInteger.ZERO)) {
			fiSum.add(newFibonacciNumber);
			}
			
			// move the fibonacci numbers around so each gets replaced with their new number
			fi1.setFibonacciNumber(fi2);
			fi2.setFibonacciNumber(newFibonacciNumber);
			// We could clear newFibonacciNumber here but there is no reason to do so.
			printValues();
			
		}
		
		return fiSum;
	}
	
	private void printValues() {
		System.out.println("fi1: " + fi1);
		System.out.println("fi2: " + fi2);
		System.out.println("newFibonacciNumber: " + newFibonacciNumber);
		System.out.println("fiSum: " + fiSum);
	}

}
