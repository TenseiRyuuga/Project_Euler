package main;

import java.math.BigInteger;

public class Calculator {

	public int calculateNumberPrime(int numberPrime) {
		int numberOfPrimes = 0;
		int number = 1;
		// this is the limit for both the array(limited by the int max value and it
		// indicates the maximum number that can be checked for being prime
		int maxLimit = 2147483647;
		boolean[] sieve = new boolean[maxLimit];
		for (int i = 2; i < maxLimit; i++) {
			// in case the sieve already contains the number we skip the loop and continue
			// with the next iteration. This will filter out any non prime numbers
			if (sieve[i] == true)
				continue;

			// raise the number of primes by 1
			numberOfPrimes++;

			// check if we reached the desired numberPrime
			if (numberOfPrimes == numberPrime) {
				// if we did find the desired number of prime move it into number and break the
				// loop so we can return it
				number = i;
				break;
			}

			// add multiples of the number to the sieve
			for (int j = i + i; j < maxLimit; j += i) {
				sieve[j] = true;
			}
		}
		return number;
	}

}
