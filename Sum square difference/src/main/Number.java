package main;

import java.math.BigInteger;

public class Number {
	private BigInteger bigInteger = new BigInteger("0");
	
	public Number(String string) {
		bigInteger = new BigInteger(string);
	}

	public BigInteger asBigInteger() {
		return bigInteger;
	}

	public void setBigInteger(BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}
	
	public void add(BigInteger bigInteger) {
		this.bigInteger = this.bigInteger.add(bigInteger);
	}

	public BigInteger subtract(Number number) {
		this.bigInteger = this.bigInteger.subtract(number.asBigInteger());
		return this.bigInteger;
	}
}
