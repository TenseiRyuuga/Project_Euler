package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import main.Calculator;
import main.FibonacciNumber;

class test_calculator {

	@Test
	void test_max_3_expected_2() {
		testCalculator("3", "2");
	}
	
	
	@Test
	void test_max_20_expected_10() {
		testCalculator("20", "10");
	}
	
	@Test
	void test_max_4000000_expected_4613732() {
		testCalculator("400000", "4613732");
	}
	
	private void testCalculator(String maximumFibonacciTotalValue, String ExpectedResult) {
		Calculator calculator = new Calculator();
		FibonacciNumber maximumFibonacciValue = new FibonacciNumber(maximumFibonacciTotalValue);
		FibonacciNumber result = calculator.calculateTheSumForFibonacciTotalWhoseValueDoesNotExceed(maximumFibonacciValue);
		assertEquals(new BigInteger(ExpectedResult), result.asBigInteger());
	}

}
