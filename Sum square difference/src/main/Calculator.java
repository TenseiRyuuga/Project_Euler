package main;

import java.math.BigInteger;
import java.util.ArrayList;

public class Calculator {

	public BigInteger calculateTheSquareSumDifferenceFor(int number) {
		BigInteger result = BigInteger.ZERO;
		ArrayList<Number> numberList = new ArrayList<>();

		// add all the different numbers to a list
		for (int i = 1; i <= number; i++) {
			numberList.add(new Number("" + i));
		}
		
		Number sumOfSquares = calculateSumOfSquaresNaturalNumbers(numberList);
		Number squareOfSum = calculateSquareOfSumNaturalNumbers(numberList);
		
		result = squareOfSum.subtract(sumOfSquares);

		return result;
	}

	private Number calculateSumOfSquaresNaturalNumbers(ArrayList<Number> numberList) {
		// add the pow 2 of every number in the list to a new Biginteger that isn't reassigned
		Number result = new Number("0");
		numberList.forEach(number -> result.add(number.asBigInteger().pow(2)));
		return result;
	}

	private Number calculateSquareOfSumNaturalNumbers(ArrayList<Number> numberList) {
		Number result = new Number("0");
		numberList.forEach(number -> result.add(number.asBigInteger()));
		result.setBigInteger(result.asBigInteger().pow(2));
		return result;
	}

}
