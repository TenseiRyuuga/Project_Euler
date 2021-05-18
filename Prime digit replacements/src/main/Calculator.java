package main;

import java.math.BigInteger;
import java.util.ArrayList;

public class Calculator {

	public BigInteger calculateSmallestPrimeWith8PrimeFamily() {
		int smallestPrimeWith8ValueFamily = 0;

		// this is the limit for both the array(limited by the int max value and it
		// indicates the maximum number that can be checked for being prime
		// added +1 since we want to add the largestnumber too and everything else
		// assumes we don't want that
		int maxLimit = 2147483647;
		boolean[] sieve = new boolean[maxLimit];
		for (int i = 2; i < maxLimit; i++) {
			// in case the sieve already contains the number we skip the loop and continue
			// with the next iteration. This will filter out any non prime numbers
			if (sieve[i] == true)
				continue;

			// Here we found a prime and now we need to check if it's part of a 8 prime
			// value family
			smallestPrimeWith8ValueFamily = smallestPrimeWith8ValueFamily.add(new BigInteger("" + i));

			System.out.println("Total: " + smallestPrimeWith8ValueFamily + " i: " + i);

			// add multiples of the number to the sieve
			for (int j = i + i; j < maxLimit; j += i) {
				sieve[j] = true;
			}
		}
		return smallestPrimeWith8ValueFamily;
	}
	
	public ArrayList<Integer> getPrimeArray() {
		ArrayList<Integer> primeList = new ArrayList<>();

		// this is the limit for both the array(limited by the int max value and it
		// indicates the maximum number that can be checked for being prime
		// added +1 since we want to add the largestnumber too and everything else
		// assumes we don't want that
		int maxLimit = 2147483647;
		boolean[] sieve = new boolean[maxLimit];
		for (int i = 2; i < maxLimit; i++) {
			// in case the sieve already contains the number we skip the loop and continue
			// with the next iteration. This will filter out any non prime numbers
			if (sieve[i] == true)
				continue;

			// Here we found a prime and now we need to check if it's part of a 8 prime
			// value family
			primeList.add(i);

			// add multiples of the number to the sieve
			for (int j = i + i; j < maxLimit; j += i) {
				sieve[j] = true;
			}
		}
		return primeList;
	}

}
