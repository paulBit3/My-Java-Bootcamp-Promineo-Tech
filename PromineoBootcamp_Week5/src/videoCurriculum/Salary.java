package videoCurriculum;

/*
 * this class implement the inherited Employee.calculatePay() method
 */
public class Salary extends Employee{
	
	
	
	
	//super class constructor
	public Salary(String name, double pay, double bonus) {
		super(name, pay, bonus);
	}
	

	@Override
	public double calculatePay() {
		
		//calculate the pay of each employee
		
		double staffPay;
		staffPay = totalHours * getPay();
		
		return staffPay;

	}

}
