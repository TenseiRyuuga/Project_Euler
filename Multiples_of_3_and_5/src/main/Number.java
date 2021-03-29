package main;

import java.math.BigInteger;

public class Number {
	public static final Number ONE = new Number(BigInteger.ONE);
	public static final Number ZERO = new Number(BigInteger.ZERO);
	private BigInteger bigInteger = BigInteger.ZERO;
	
	public Number() {
		super();
		this.bigInteger = BigInteger.ZERO;
	}
	
	private Number(BigInteger bigInteger) {
		super();
		this.bigInteger = bigInteger;
	}
	
	public void add(Number number) {
		bigInteger = bigInteger.add(number.asBigInteger());
	}

	public void setNumber(BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}
	
	public String toString() {
		return bigInteger.toString();
	}
	
	public BigInteger asBigInteger() {
		return bigInteger;
	}
	
}
