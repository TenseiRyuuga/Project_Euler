package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class test_Calculator {

	@Test
	void test() {
		test_Caslculator(5, 6);
	}
	
	@Test
	void test2() {
		test_Caslculator(7, 12);
	}
	
	@Test
	void test3() {
		test_Caslculator(100, 190569291);
	}
	
	private void test_Caslculator(int number, int expected) {
		Calculator calculator = new Calculator();
		int result = calculator.CalculateTheAmountOfWrittenSumsWithAtLeast2PositiveIntegers(number);
		System.out.println(result);
		assertEquals(expected, result);
	}

}
