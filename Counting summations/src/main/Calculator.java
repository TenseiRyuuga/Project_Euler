package main;

public class Calculator {

	private int numberOfSums = 0;

	private final int QUICK = 1;
	private final int PRINT = 2;

	public int CalculateTheAmountOfWrittenSumsWithAtLeast2PositiveIntegers(int number) {
		return printSums(number);
	}

	private int printSums(int startNumber) {
		numberOfSums = 0;

		if (startNumber > 1) {
			printSummations(startNumber, QUICK);
		}
		return numberOfSums;
	}

	private void printSummations(int startNumber, int key) {
		switch (key) {
		case QUICK:
//			 keep substracting until we have only 1 left(which will create the sum with
//			 only 1's
			for (int i = 0; (startNumber - i) > 0; i++) {
				// clear the stringbuilder since we're making a new sum
				countSummations(i, startNumber - i);
			}
			break;

		case PRINT:
//				 keep substracting until we have only 1 left(which will create the sum with
//				 only 1's
			for (int i = 0; (startNumber - i) > 0; i++) {
				// clear the stringbuilder since we're making a new sum
				StringBuilder sum = new StringBuilder();
				sum.append("" + (startNumber - i));
				appendSubSum(i, sum, startNumber - i);
			}
			break;
		}
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

				if (number > 0) {
					for (int i = 0; (number - i) > 0; i++) {
						StringBuilder sum2 = new StringBuilder(sum);
						int loweredNumber = number - i;
						sum2.append("+" + (loweredNumber));
						appendSubSum(number - loweredNumber, sum2, loweredNumber);

					}
				}
			} else if (parentNumber < number) {
				for (int i = 0; (number - i) > 0; i++) {
					StringBuilder sum3 = new StringBuilder(sum);
					int loweredNumber = number - i;
					if (parentNumber >= loweredNumber) {
						sum3.append("+" + (loweredNumber));
						appendSubSum(number - loweredNumber, sum3, loweredNumber);
					}
				}
			}

		}
	}

	private void countSummations(int number, int parentNumber) {
		int one = 1;

		// check if the number given is bigger than 0 because it makes no sense to add
		// +0
		if (number > 0) {

			// then we print the sum as is unless the number given is bigger than it's
			// parent
			if (parentNumber >= number) {
				numberOfSums++;

				if (number > 0) {
					for (int i = 0; (number - i) > 0; i++) {

						int loweredNumber = number - i;
						countSummations(number - loweredNumber, loweredNumber);

					}
				}
			} else if (parentNumber < number) {
				for (int i = 0; (number - i) > 0; i++) {

					int loweredNumber = number - i;
					if (parentNumber >= loweredNumber) {

						countSummations(number - loweredNumber, loweredNumber);
					}
				}
			}

		}
	}

}
