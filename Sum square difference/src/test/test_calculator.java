package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import main.Calculator;

class test_calculator {

	@Test
	void test() {
		Calculator cal = new Calculator();
		int number = 10;
		BigInteger expected = new BigInteger("2640");
		BigInteger result = cal.calculateTheSquareSumDifferenceFor(number);
		assertEquals(expected, result);
	}
	
	@Test
	void test2() {
		Calculator cal = new Calculator();
		int number = 100;
		BigInteger expected = new BigInteger("25164150");
		BigInteger result = cal.calculateTheSquareSumDifferenceFor(number);
		assertEquals(expected, result);
	}

}
