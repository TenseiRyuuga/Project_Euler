package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Calculator;

class test_calculator {

	@Test
	void test_multiple_of_3_for_10() {
		ArrayList<BigInteger> multipleOfs = new ArrayList<>();
		multipleOfs.add(BigInteger.valueOf(3L));
		
		BigInteger maxNumber = BigInteger.valueOf(10L);
		BigInteger expectedResult = BigInteger.valueOf(18L);
		
		testCalculator2(maxNumber, multipleOfs, expectedResult);
	}
	
	@Test
	void test_multiple_of_5_for_10() {
		ArrayList<BigInteger> multipleOfs = new ArrayList<>();
		multipleOfs.add(BigInteger.valueOf(5L));
		
		BigInteger maxNumber = BigInteger.valueOf(10L);
		BigInteger expectedResult = BigInteger.valueOf(5L);
		
		testCalculator2(maxNumber, multipleOfs, expectedResult);
	}
	
	@Test
	void test_multiple_of_3_and_5_for_10() {
		ArrayList<BigInteger> multipleOfs = new ArrayList<>();
		multipleOfs.add(BigInteger.valueOf(3L));
		multipleOfs.add(BigInteger.valueOf(5L));
		
		BigInteger maxNumber = BigInteger.valueOf(10L);
		BigInteger expectedResult = BigInteger.valueOf(23L);
		
		testCalculator2(maxNumber, multipleOfs, expectedResult);
	}
	
	@Test
	void test_multiple_of_3_and_5_for_1000() {
		ArrayList<BigInteger> multipleOfs = new ArrayList<>();
		multipleOfs.add(BigInteger.valueOf(3L));
		multipleOfs.add(BigInteger.valueOf(5L));
		
		BigInteger maxNumber = BigInteger.valueOf(1000L);
		BigInteger expectedResult = BigInteger.valueOf(233168L);
		
		testCalculator2(maxNumber, multipleOfs, expectedResult);
	}
		
	private void testCalculator2(BigInteger number, ArrayList<BigInteger> multipleOfs, BigInteger expectedResult) {
		Calculator calculator = new Calculator();
		BigInteger result = calculator.totalForTheNumberBelowAndMultipleOfs(number, multipleOfs);
		assertEquals(expectedResult, result);
	}

}
