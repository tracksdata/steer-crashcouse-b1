package com;

public class Employee {

	int empId;
	String empName;
	double salary;

	void processSalary() {
		salary = salary + 10000; //? for what object? : who ever calling this method (this)
	}
	
	/*
	void display() { // whose data is displayed? : who ever is calling. (this)
		System.out.println("ID: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("--------------------------");
	}
	*/
			
 // v2 of display
			
   static void display(Employee empObj) {
	   System.out.println("ID: "+empObj.empId);
	   System.out.println("Name: "+empObj.empName);
	   System.out.println("Salary: "+empObj.salary);
	   System.out.println("================================");
   }
			

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		

		e1.empId = 10;
		e1.empName = "Sam";
		e1.salary=25000;

		e2.empId = 11;
		e2.empName = "Bucky";
		e2.salary=35000;

		e3.empId = 12;
		e3.empName = "Rose";
		e3.salary=45000;
		
		
		e1.processSalary();
		e2.processSalary();
		e3.processSalary();
		
		//e1.display();
		//e2.display();
		//e3.display();
		
		display(e1);
		display(e2);
		display(e3);
		
		
		
		
		
		
		

	}

}
