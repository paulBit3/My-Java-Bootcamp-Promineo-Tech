package videoCurriculum;

/*
 * abstract class
 */
public abstract class Employee {
	/*
	 * fields
	 */
	
	private String name;
	private String address;
	private String reportTo;
	private int age;
	private double pay;
	private int hoursWorked;
	private double hourlyPay;
	private double bonus;
	
	



	//value cannot be changed
	public final double hourlyRate = 30.00;
	public final int totalHours = 80;
	
	
	//constructor
	public Employee() {}
	
	public Employee(String name, double pay, double bonus) {
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	
	
	
	
	//public methods
	
	
	public String getInfo() {
		return "Name: " + name
				+"\nAge: " + age
				+"\nReports to: " + reportTo
				+ "\nAddress: " + address;
	}
	
	 //abstract class
	public abstract double calculatePay();
	
	
	

	
	
	/*
	 * getters and setters
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportTo() {
		return reportTo;
	}

	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	

}
