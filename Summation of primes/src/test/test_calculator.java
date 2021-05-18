package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import main.Calculator;

class test_calculator {

	@Test
	void test() {
		Calculator cal = new Calculator();
		BigInteger result = cal.calculateSummationOfPrimesBelow(10);
		BigInteger expected = new BigInteger("17");
		assertEquals(expected, result);
	}

	@Test
	void test2() {
		Calculator cal = new Calculator();
		BigInteger result = cal.calculateSummationOfPrimesBelow(10001);
		BigInteger expected = new BigInteger("5736396");
		assertEquals(expected, result);
	}
	
	@Test
	void test3() {
		Calculator cal = new Calculator();
		BigInteger result = cal.calculateSummationOfPrimesBelow(2000000);
		BigInteger expected = new BigInteger("142913828922");
		assertEquals(expected, result);
	}

}
