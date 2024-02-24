package com.model;

public class Complex {
	private int real;
	private int imag;

	public Complex() {
		this(0, 0);
	}

	public Complex(int a, int b) {
		this.real = a;
		this.imag = b;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int a) {
		this.real = a;

	}

	public int getImag() {
		return imag;
	}

	public void setImag(int b) {
		this.imag = b;
	}

}
