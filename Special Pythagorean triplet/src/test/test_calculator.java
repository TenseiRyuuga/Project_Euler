package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class test_calculator {

	@Test
	void test() {
		Calculator cal = new Calculator();
		int x = 1000;
		int answer = cal.calculatePythagoreanTripletProduct(x);
		int expected = 31875000;
		assertEquals(expected, answer);
	}

}
