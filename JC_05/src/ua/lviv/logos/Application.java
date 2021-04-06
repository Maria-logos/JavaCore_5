package ua.lviv.logos;

import ua.lviv.logos.GeneralSalary.WorkPosition;

public class Application {

	public static void main(String[] args) {
		
		GeneralSalary generalSal = new GeneralSalary(WorkPosition.Staff);
		System.out.println("Salary for " + generalSal.toString() + " " + generalSal.SalaryAmount() + " dollars per months" );
		
		HourSalary hourSal = new HourSalary(120, WorkPosition.Junior);
		System.out.println("Salary for " + hourSal.toString() + " " + hourSal.SalaryAmount() + " dollars per months" );

	}

}
