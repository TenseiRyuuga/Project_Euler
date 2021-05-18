package main;

public class Calculator {
	
	public int calculatePythagoreanTripletProduct(int number) {
		// a^2+b^2=c^2
		// a^2+b^2-c^2 = 0
		// a + b + c = 1000
		
		// set a boolean for found and set it to false since we haven't found anything
		boolean found = false;
		
		int power = 2;
		int answer = 0;
		
		for(int a = 1; a < number/3; a++ ) {
			for(int b = 1; b < number/2; b++ ) {			
				int c = number - a - b;
				
				if (a*a + b*b == c*c) {
					System.out.println("a: " + a + " b: " + b + " c: " + c);
					answer = a*b*c;
					return answer;
				}
			}
		}
		return answer;		
	}
	
	public double calculatePythagoreanTripletProduct(double number) {
		// a^2+b^2=c^2
		// a^2+b^2-c^2 = 0
		// a + b + c = 1000
		
		// set a boolean for found and set it to false since we haven't found anything
		boolean found = false;
		
		int power = 2;
		double answer = 0;
		
		for(double a = 1; a < number; a++ ) {
			for(double b = 1; b < number; b++ ) {	
				// a^pow
				double aPowered = Math.pow(a, power);
				// b^pow
				double bPowered = Math.pow(b, power);
				// = c^pow
				double cPowered = aPowered + bPowered;
				// and therefore the root of c^pow = c
				double c = Math.sqrt(cPowered);
				
				System.out.println("a: " + a + " b: " + b + " c: " + c);
				// a + b + c should equal the given number
				if ((a + b + c) == number ) {
					System.out.println("=a: " + a + " b: " + b + " c: " + c);
					answer = a*b*c;
					return answer;
				}
			}
		}
		return answer;	
	}

}
