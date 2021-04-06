package ua.lviv.logos;

import ua.lviv.logos.GeneralSalary.WorkPosition;

public class HourSalary implements Salary {
	
	private double hours;
	
	private WorkPosition workPosition = WorkPosition.Junior;
	
	public HourSalary(double hours, WorkPosition workPosition) {
		super();
		this.hours = hours;
		this.workPosition = workPosition;
	}

	public double SalaryAmount() {
		switch (workPosition) {
		case Junior:
		    return (hours * 10);
		case Staff:
			return (hours * 20);
		case Seniour:
			return (hours * 30);
		default:
		    return (hours * 10);
		}
	}

	@Override
	public String toString() {
		return "HourSalary [hours=" + hours + ", workPosition=" + workPosition + "]";
	}
	
	

}
