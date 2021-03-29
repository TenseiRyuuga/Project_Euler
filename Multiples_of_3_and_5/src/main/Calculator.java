package main;

import java.math.BigInteger;
import java.util.ArrayList;

public class Calculator {

	public BigInteger totalForTheNumberBelowAndMultipleOfs(BigInteger maxNumber, ArrayList<BigInteger> multipleOfs) {
		// the total of all numbers found
		Number total = new Number();
		// the counter we start at 1 because 0 can not be divided or give a useful addition to the total
		Number number = new Number();
		number.setNumber(BigInteger.ONE);
		
		// check if the number being tested is bigger than the maxNumber this means the compare should return bigger than 0(equal) or -1(lesser than) when comparing maxNumber to our testing number
		while (maxNumber.compareTo(number.asBigInteger()) > 0) {		
			if (multipleOfs.stream().anyMatch(multipleOf -> number.asBigInteger().divideAndRemainder(multipleOf)[1].compareTo(BigInteger.ZERO) == 0)) {
				System.out.println("adding " + number);
				total.add(number);
			}

			// raise the number by one after we finish testing it against all multipleOfs or found a match
			number.add(Number.ONE);
		}	
		
		System.out.println("Total amount is: " + total);
		return total.asBigInteger();
	}

}
