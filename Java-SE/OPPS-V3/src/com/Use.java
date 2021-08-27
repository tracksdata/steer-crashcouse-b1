package com;

public class Use {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEmpId(10);
		e1.setEmpName("Sarah");
		e1.setSalary(386383);
		
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getSalary());
		
		System.out.println("==========================================");
	}

}
