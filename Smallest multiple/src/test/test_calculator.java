package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import main.Calculator;

class test_calculator {

	@Test
	void test() {
		Calculator cal = new Calculator();
		BigInteger result = cal.calculateSmallestNumberEvenlyDivisibleBy(10);
		assertEquals(new BigInteger("2520"), result);
	}

	@Test
	void test2() {
		Calculator cal = new Calculator();
		BigInteger result = cal.calculateSmallestNumberEvenlyDivisibleBy(20);
		assertEquals(new BigInteger("232792560"), result);
	}

}
