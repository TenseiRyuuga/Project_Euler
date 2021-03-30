package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class test_calculator {

	@Test
	void test() {
		Calculator cal = new Calculator();
		int result = cal.calculateBiggestPalindromeOfTwo3DigitNumbers();
		assertEquals(906609, result);
	}
	
	

}
