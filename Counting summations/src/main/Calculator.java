package main;

public class Calculator {

	public int CalculateTheAmountOfWrittenSumsWithAtLeast2PositiveIntegers(int number) {
		printSums(number);
		return quickCalc(number);

	}

	private int quickCalc(int number) {
		int result = number - 1 + quickCalc2(number, 1);
		return result;
	}

	private int quickCalc2(int number, int i) {
		i += 2;
		if (number - i > 0) {
			return number - (i) + quickCalc2(number, i);
		} else {
			return number - i;
		}
	}

	private int printSums(int number) {
		int numberOfSums = 0;

		if (number > 1) {
			// keep substracting until we have only 1 left(which will create the sum with
			// only 1's
			for (int i = 1; (number - i) > 0; i++) {
				// clear the stringbuilder since we're making a new sum
				StringBuilder sum = new StringBuilder();
				if ((number - i) >= i) {
					// since number - i is bigger than i we know there isn't a duplicate yet and so
					// we can print and add this sum to the counter
					numberOfSums++;
					sum.append("" + (number - i) + "+" + i);
					System.out.println(sum);
				} else {
					// in case i is bigger than number - i we'll have to downsize i before adding it
					// to avoid duplicates(a sum that looks different but is just a rearrangement
					// of the numbers)
					sum.append("" + (number - i));
				}

				if (i > 1) {
					StringBuilder subSum = new StringBuilder();
					subSum.append("" + (number - i));
					appendSubSum(i, subSum, number - i);
					numberOfSums++;
					System.out.println(subSum);
				}
			}
		}
		return numberOfSums;
	}

	private void appendSubSum(int number, StringBuilder sum, int parentNumber) {
		int one = 1;
		if ((number - one) >= one && parentNumber >= (number - one)) {
			sum.append("+" + (number - one));
			parentNumber = (number - one);
			number = number - one;
		} 
		else if ((number - one) >= one && parentNumber < (number - one)) {
			sum.append("+" + (parentNumber));
			number = number - parentNumber;
		}
		
		if (number> one) {
			appendSubSum(number, sum, parentNumber);
		}
		else if (number == one){
			sum.append("+" + one);
		}
		
	}
}
