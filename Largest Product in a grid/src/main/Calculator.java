package main;

import java.math.BigInteger;
import java.util.ArrayList;

public class Calculator {

	public BigInteger calculateLargestProductInAGrid(String[] gridNumbers, int rowLength, int columnLength) {
		BigInteger largestProductInGrid = BigInteger.ZERO;
		BigInteger largestProductForShift = BigInteger.ZERO;

		// start with diagonals and then compare each result to get the largest product
		// returned
		largestProductInGrid = calculateLargestProductInAGridTLBR(gridNumbers, rowLength, columnLength);

		largestProductInGrid = largestProductInGrid
				.max(calculateLargestProductInAGridBLTR(gridNumbers, rowLength, columnLength));
		largestProductInGrid = largestProductInGrid
				.max(calculateLargestProductInAGridTB(gridNumbers, rowLength, columnLength));
		largestProductInGrid = largestProductInGrid
				.max(calculateLargestProductInAGridLR(gridNumbers, rowLength, columnLength));

		return largestProductInGrid;
	}

	// Top Right Bottom Left
	private BigInteger calculateLargestProductInAGridTLBR(String[] gridNumbers, int rowLength, int columnLength) {
		return calculateLargestProductInAGridWithShift(gridNumbers, rowLength, columnLength, rowLength + 1);
	}

	// Top Left Bottom Right
	private BigInteger calculateLargestProductInAGridBLTR(String[] gridNumbers, int rowLength, int columnLength) {
		return calculateLargestProductInAGridWithShift(gridNumbers, rowLength, columnLength, rowLength - 1);
	}

	// Top Bottom
	private BigInteger calculateLargestProductInAGridTB(String[] gridNumbers, int rowLength, int columnLength) {
		return calculateLargestProductInAGridWithShift(gridNumbers, rowLength, columnLength, rowLength);
	}

	// Left Right
	private BigInteger calculateLargestProductInAGridLR(String[] gridNumbers, int rowLength, int columnLength) {
		return calculateLargestProductInAGridWithShift(gridNumbers, rowLength, columnLength, 1);
	}

	private BigInteger calculateLargestProductInAGridWithShift(String[] gridNumbers, int rowLength, int columnLength,
			int rowShift) {
		return calculateLargestProduct(gridNumbers, rowLength, columnLength, 0, rowShift, 2 * rowShift, 3 * rowShift);
	}

	private BigInteger calculateLargestProduct(String[] gridNumbers, int rowLength, int columnLength, int number1Offset,
			int number2Offset, int number3Offset, int number4Offset) {
		BigInteger largestProductInGrid = BigInteger.ZERO;
		// if the amount of gridnumbers do not match the requested rowLength and
		// columnLength we're not gonna try to find the largest product
		if (gridNumbers.length == (rowLength * columnLength)) {
			BigInteger productInGrid = BigInteger.ZERO;

			// we stop the loop before the last entry falls off the grid
			for (int i = 0; i < gridNumbers.length - number4Offset; i++) {
				BigInteger number4Index = new BigInteger("" + (i + number4Offset));
				BigInteger bigRowLength = new BigInteger("" + rowLength);

				BigInteger number1 = new BigInteger(gridNumbers[i + number1Offset]);
				BigInteger number2 = new BigInteger(gridNumbers[i + number2Offset]);
				BigInteger number3 = new BigInteger(gridNumbers[i + number3Offset]);
				BigInteger number4 = new BigInteger(gridNumbers[i + number4Offset]);

				productInGrid = number1.multiply(number2).multiply(number3).multiply(number4);
				System.out
						.println("" + number1 + " " + number2 + " " + number3 + " " + number4 + " = " + productInGrid);

				// check if the found product is larger
				if (largestProductInGrid.compareTo(productInGrid) == -1) {
					largestProductInGrid = productInGrid;
				}
			}
		}

		return largestProductInGrid;
	}

	public BigInteger calculateSmallestPrimeWith8PrimeFamily() {
		// TODO Auto-generated method stub
		return null;
	}

}
