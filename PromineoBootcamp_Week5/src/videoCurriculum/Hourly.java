package videoCurriculum;

/*
 * this class implement the inherited Employee.calculPay() method
 */
public class Hourly extends Employee {
	
	private int hoursWorked;
	private double hourlyPay;
	
	
	////super class constructor
	public Hourly(String name, double pay, int hoursWorked, double hourlyPay, double bonus) {
		super(name, pay, bonus);
		this.hoursWorked = hoursWorked;
		this.hourlyPay = hourlyPay;
	}
	

	@Override
	public double calculatePay() {
		// 
		//checking work hour
		if(hoursWorked > 0)
			return (int) (hoursWorked * getPay());
		else
			return 0;

	}
	
	
	

}
