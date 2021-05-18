package main;

import java.math.BigInteger;

public class Calculator {

	public BigInteger largestProductInSeries(String series, int numberOfDigits) {
		StringBuilder seriesBuilder = new StringBuilder(series);
		BigInteger largestProduct = BigInteger.ZERO;
		for (int i = 0; i < (seriesBuilder.length() - numberOfDigits); i++) {
			BigInteger product = BigInteger.ONE;
			for (int j = 0; j < numberOfDigits; j++) {
				String number = seriesBuilder.substring((i + j), (i + j + 1));
				product = product.multiply(new BigInteger(number));
			}
			if (largestProduct.compareTo(product) == -1) {
				largestProduct = product;
			}
		}
		System.out.println("Largest product = " + largestProduct);
		return largestProduct;
	}

}
