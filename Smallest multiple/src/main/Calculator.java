package main;

import java.math.BigInteger;
import java.util.ArrayList;

public class Calculator {

	public BigInteger calculateSmallestNumberEvenlyDivisibleBy(int number) {
		BigInteger result = BigInteger.ZERO;
		boolean found = false;
		ArrayList<BigInteger> dividerList = new ArrayList<>();

		// add all dividers to a list
		for (int i = 1; i <= number; i++) {
			dividerList.add(new BigInteger("" + i));
		}
		
		// start checking from number and go upwards since we can never divide everything from a number below the highest divider
		// TODO there seems to be a way to do this with prime factorization which will massively improve performance
		for (int i = number; !found; i++) {
			final BigInteger j = new BigInteger("" + i);
			if(dividerList.stream().allMatch(divider -> j.divideAndRemainder(divider)[1].compareTo(BigInteger.ZERO) == 0)) {
				result = j;
				found= true;
			}
		}
		return result;
	}

}
