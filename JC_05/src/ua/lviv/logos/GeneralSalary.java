package ua.lviv.logos;

public class GeneralSalary implements Salary {
	
	@Override
	public String toString() {
		return "GeneralSalary [workPosition=" + workPosition + "]";
	}

	public enum WorkPosition{

		Junior,
	    Staff,
	    Seniour
	}

	private WorkPosition workPosition = WorkPosition.Junior; 
	
	public GeneralSalary(WorkPosition workPosition) {
		super();
		this.workPosition = workPosition;
	}



	@Override
	public double SalaryAmount() {
		switch (workPosition) {
		case Junior:
		    return 1000;
		case Staff:
			return 2000;
		case Seniour:
			return 3000;
		default:
		    return 1000;
		}
		
			
	}

}
