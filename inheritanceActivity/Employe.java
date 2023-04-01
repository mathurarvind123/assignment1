package inheritanceActivity;

public class Employe {
	public class Employee { // creating employee class
		long employeeId;
		String employeeName;
		String employeeAddress;
		Long employeePhone;
		double basicSalary;
		double specialAllowance=250.80;
		double Hra =1000.50;

	// parameterized constructor
		public Employee(long Id, String Name, String Address, long Phone) {
		this.employeeId=Id;
		this.employeeName=Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;	
	}
	void calcluateSalary() { // method for calculating salary
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100); 
		System.out.println("Salary of "+employeeName+" is "+salary );
	}
	void calculatetransportAllowance(){ // method for transport allowance
		double transportAllowance = 10*basicSalary/100;
		System.out.println("Transport allowance of "+employeeName+" is "+transportAllowance );
	}
	}
	// Deriving Trainee class from Employee class 	
	class Manager extends Employee { // sub class of employee class
		public Manager(long Id, String Name, String Address, long Phone,double Salary) {
			super(Id, Name, Address, Phone);
			super.basicSalary=Salary;
		}
		void calculatetransportAllowance() { // 
			double transportAllowance = 15*basicSalary/100;
			System.out.println("Transport allowance of "+employeeName+" is "+transportAllowance);		
		}
	}	
	// Deriving Trainee class from Employee class 	
	class Trainee extends Employee{ // sub class of Employee class
		public Trainee(long Id, String Name, String Address, long Phone,double Salary) {
			super(Id, Name, Address, Phone);
			super.basicSalary=Salary;
		}

	}
