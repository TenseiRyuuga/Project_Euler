package main;

import java.math.BigInteger;

public class Calculator {

	public BigInteger calculateSummationOfPrimesBelow(int largestNumber) {
		// using a bigInteger since the number can become too large for int with high
		// largestNumbers such as 1976173 or larger
		BigInteger numberPrimeTotal = BigInteger.ZERO;
		// this is the limit for both the array(limited by the int max value and it
		// indicates the maximum number that can be checked for being prime
		// added +1 since we want to add the largestnumber too and everything else
		// assumes we don't want that
		int maxLimit = largestNumber;
		boolean[] sieve = new boolean[maxLimit];
		for (int i = 2; i < maxLimit; i++) {
			// in case the sieve already contains the number we skip the loop and continue
			// with the next iteration. This will filter out any non prime numbers
			if (sieve[i] == true)
				continue;

			// raise primeTotal by the found prime
			// we're casting int to a string implicitely because we can't make a Biginteger
			// from a int or add an int to a bigInteger
			// because each Biginteger is implicitely final we need to overwrite the memory
			// address of the current bigInteger with the address of the returned new
			// Biginteger
			numberPrimeTotal = numberPrimeTotal.add(new BigInteger("" + i));

			System.out.println("Total: " + numberPrimeTotal + " i: " + i);

			// add multiples of the number to the sieve
			for (int j = i + i; j < maxLimit; j += i) {
				sieve[j] = true;
			}
		}
		return numberPrimeTotal;
	}

}
