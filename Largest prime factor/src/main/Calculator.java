package main;

import java.math.BigInteger;
import java.util.ArrayList;

public class Calculator {

	public BigInteger calculateLargestPrimeNumbersFor(BigInteger number) {
		BigInteger i = new BigInteger("2");

		// we compare 2 to the squareroot of the given number and check if the result is less or equal to 2
		// the reason we're using a big int is because the requested number is too large for other types.
		while (i.compareTo(number.sqrt()) <= 0) {

			// We divide the number by 2 and request the result and remainder so that we can check whether there is no remainder
			if (number.divideAndRemainder(i)[1].compareTo(BigInteger.ZERO) == 0) {
				// We keep checking if the remainder is zero 
				while (number.divideAndRemainder(i)[1].compareTo(BigInteger.ZERO) == 0) {
					// while it is we keep dividing the number by 2
					number = number.divide(i);
				}
				// we check whether the number is equal to 1
				if (number.compareTo(BigInteger.ONE) == 0) {
					// in case it is we replace it by i
					number = i;
					break;
				}
			} else {
				// if the number still has a remainder when it's divided by i we don't have a correct number yet so we increase i
				i = i.add(BigInteger.ONE);
			}
		}
		return number;
	}
}
