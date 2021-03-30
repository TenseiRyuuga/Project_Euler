package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Calculator;

class test_caslculator {

	@Test
	void test() {
		BigInteger number = new BigInteger("13195");
		BigInteger expected = new BigInteger("29");
		testCalculator(number, expected);
		
	}
	
	@Test
	void test2() {
		BigInteger number = new BigInteger("600851475143");
		BigInteger expected = new BigInteger("6857");
		testCalculator(number, expected);
		
	}
	
	private void testCalculator(BigInteger number, BigInteger expected) {
		Calculator cal = new Calculator();
		BigInteger result = cal.calculateLargestPrimeNumbersFor(number);
		assertEquals(expected, result);
	}

}
