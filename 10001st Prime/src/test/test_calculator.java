package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import main.Calculator;

class test_calculator {

	@Test
	void test() {
		Calculator cal = new Calculator();
		int result = cal.calculateNumberPrime(6);
		int expected = 13;
		assertEquals(expected, result);
	}

	@Test
	void test2() {
		Calculator cal = new Calculator();
		int result = cal.calculateNumberPrime(10001);
		int expected = 104743;
		assertEquals(expected, result);
	}
	
	@Test
	void test3() {
		Calculator cal = new Calculator();
		int result = cal.calculateNumberPrime(1000000);
		int expected = 104743;
		assertEquals(expected, result);
	}

}
