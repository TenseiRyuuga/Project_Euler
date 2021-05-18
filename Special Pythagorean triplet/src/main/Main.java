package main;

public class Main {

	public static void main(String[] args) {
		String tb = "Special Pythagorean triplet";
		System.out.println(tb);
		Calculator cal = new Calculator();
		int x = 1000;
		int answer = cal.calculatePythagoreanTripletProduct(x);
		System.out.println("result: " + answer);		
	}
}
