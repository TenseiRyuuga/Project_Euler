package main;

import java.math.BigInteger;

public class Calculator {
	
	public int calculateBiggestPalindromeOfTwo3DigitNumbers() {
	int largestPalindromeResult = 0;
		
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				int result = i*j;
				if(isPalindrome(result) && largestPalindromeResult < result) {
					System.out.println("new palindrome " + i*j + " found for " + i + "x" + j);
					largestPalindromeResult = result;
				}
			}
		}
		return largestPalindromeResult;
	}	
	public static boolean isPalindrome(int integer) {
	    String intStr = String.valueOf(integer); 
	    return intStr.equals(new StringBuilder(intStr).reverse().toString());
	}
}
