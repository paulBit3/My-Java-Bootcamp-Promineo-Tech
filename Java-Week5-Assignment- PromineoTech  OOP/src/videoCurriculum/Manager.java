package videoCurriculum;

import java.lang.module.FindException;

/*
 * this class implement the inherited Employee.calculatePay() method
 */

public class Manager extends Employee {

	
	//value cannot be changed
	public double allowance = 15.00;
	private double managerPay;
	
	
	//super class constructor
	public Manager(String name, double pay, double bonus, double allowance) {
		super(name, pay, bonus);
		this.allowance = allowance;
	}
	
	
   //inherited Employee.calculatePay() method
	
	@Override
	public double calculatePay() {
		try {
			if(allowance > 0)
				managerPay = totalHours * getPay() + getBonus() + allowance;
				//return (int) (totalHours * getPay() + getBonus() + allowance);
				
			else
					managerPay = totalHours * getPay();
		} catch(FindException e) {
			System.out.println(e.toString());
		}
		return (int)(managerPay); 
		

	}
	
	

}
