package com.lgs.lab.interface2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyCalculator calculator = new MyCalculator();
        System.out.println("Add 10+20 = " + calculator.add(10, 20));
        System.out.println("Devide 20/10 = " + calculator.add(20, 10));
        System.out.println("Minus 20-10 = " + calculator.add(20, 10));
        System.out.println("Multiple 20*10 = " + calculator.add(10, 20));
	}

}
