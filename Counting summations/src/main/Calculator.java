package main;

public class Calculator {

	private int numberOfSums = 0;

	public int CalculateTheAmountOfWrittenSumsWithAtLeast2PositiveIntegers(int number) {
		return printSums(number);
	}

	private int printSums(int startNumber) {
		numberOfSums = 0;

		if (startNumber > 1) {
//			 keep substracting until we have only 1 left(which will create the sum with
//			 only 1's
			for (int i = 0; (startNumber - i) > 0; i++) {
				// clear the stringbuilder since we're making a new sum
				StringBuilder sum = new StringBuilder();
				sum.append("" + (startNumber - i));
				appendSubSum(i, sum, startNumber - i);
			}
		}
		return numberOfSums;
	}

	private void appendSubSum(int number, StringBuilder sum, int parentNumber) {
		int one = 1;

		// check if the number given is bigger than 0 because it makes no sense to add
		// +0
		if (number > 0) {
			String startSum = sum.toString();

			// then we print the sum as is unless the number given is bigger than it's
			// parent
			if (parentNumber >= number) {
				numberOfSums++;
				StringBuilder sum1 = new StringBuilder(sum);
				sum1.append("+" + (number));
				System.out.println(sum1);
				
				if (number > one) {
					StringBuilder sum2 = new StringBuilder(sum);
					int loweredNumber = (number - one);
					sum2.append("+" + loweredNumber);
					appendSubSum((number - loweredNumber), sum2, loweredNumber);
				}
			}
			else {
				StringBuilder sum3 = new StringBuilder(sum);
				sum3.append("+" + (parentNumber));
				appendSubSum((number - parentNumber), sum3, parentNumber);
				
				if(parentNumber > one) {
					StringBuilder sum4 = new StringBuilder(sum);
					int loweredParent = (parentNumber - one);
					sum4.append("+" + loweredParent);
					appendSubSum(number - loweredParent, sum4, loweredParent);
				}
			}
		}
	}
}
