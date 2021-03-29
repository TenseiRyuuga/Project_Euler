package main;

import java.math.BigInteger;

public class FibonacciNumber {
	public static final FibonacciNumber ZERO = new FibonacciNumber(BigInteger.ZERO);
	public static final FibonacciNumber ONE = new FibonacciNumber(BigInteger.ONE);
	private BigInteger bigInteger = BigInteger.ZERO;
	
	public FibonacciNumber() {
		super();
		this.bigInteger = BigInteger.ZERO;
	}
	
	private FibonacciNumber(BigInteger bigInteger) {
		super();
		this.bigInteger = bigInteger;
	}
	
	public FibonacciNumber(String string) {
		super();
		this.bigInteger = new BigInteger(string);
	}
	
	public FibonacciNumber add(FibonacciNumber number) {
		bigInteger = bigInteger.add(number.asBigInteger());
		return this;
	}

	public void setFibonacciNumber(BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}
	
	public void setFibonacciNumber(FibonacciNumber fibonacciNumber) {
		this.bigInteger = fibonacciNumber.asBigInteger();
	}
	
	public String toString() {
		return bigInteger.toString();
	}
	
	public BigInteger asBigInteger() {
		return bigInteger;
	}
	
	public int compareTo(FibonacciNumber fibonacciNumber) {
		return bigInteger.compareTo(fibonacciNumber.asBigInteger());
	}
}
