package main;

import java.math.BigInteger;

public class Calculator {

	public int calculateNumberPrime(int numberPrime) {
		int numberOfPrimes = 0;
		int number = 1;
		int maxLimit = 10000000;
		boolean[] sieve = new boolean[maxLimit];
		for (int i = 2; i < maxLimit; i++) {
			if (sieve[i] == true)
				continue;

			numberOfPrimes++;

			if (numberOfPrimes == numberPrime) {
				number = i;
				break;
			}

			for (int j = i + i; j < maxLimit; j += i) {
				sieve[j] = true;
			}
		}
		return number;
	}

}
