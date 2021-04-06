package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{

	public MyCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double minus(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double devide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
