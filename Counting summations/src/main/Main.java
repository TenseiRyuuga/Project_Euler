package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("Counting summations");
		Calculator cal = new Calculator();
		int answer = cal.CalculateTheAmountOfWrittenSumsWithAtLeast2PositiveIntegers(5);
		
		System.out.println("Answer is: " + answer);
	}

}
