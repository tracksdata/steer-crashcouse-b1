package com;


public class Methods {
	int a;
	int b;
	
	/*
	 * Notes
	 * ----------
	 * 	-> every method in in java must return a value. if no value to be return, then return type must be 'void'
	 * 	-> method must return only one value
	 * 
	 * Types of methods in java  : 4 types
	 * ----------------------------------------------------------
	 * 	1. method without return type and with out arguments
	 *  2. method with return type and with out arguments
	 *  3. method without return type and with arguments
	 *  4. method with return type and with arguments
	 */
	
	 // type 1:  method without return type and with out arguments
	void  f1() {
		System.out.println(">>> f1");
	}
	//2. method with return type and with out arguments
	
	int max() {
		return 100;
	}
	int max_v1() {
		int a=100;
		int b=200;
		if(a>b) 
		return a;
		else
		return b;	
	}
	
	//3. method without return type and with arguments
	
	void f2(int x,int y) {
		
	}
	
	//4. method with return type and with arguments
	int sum(int x,int y) { // method body / definition. here x, y are formal arguments
		x=10;
		y=20;
		System.out.println(">>> Within Method calling: x= "+x+" and y= "+y);

		return x+y;
	}
	
	int sum_v1(Methods mObj) {
		mObj.a=50;
		mObj.b=60;
		System.out.println(">>> Within Method body: x= "+mObj.a+" and y= "+mObj.b);
		return mObj.a+mObj.b;
	}
	
	/*
	 * Types of arguments: 2 types
	 * 	1. actual argument
	 * 	2. formal argument
	 */
	
	
	/*
	 * Scopes
	 * ----------
	 * 1. local scope
	 * 2. class scope
	 */
	   
	
	public static void main(String[] args) {
		
		Methods m1=new Methods();
		
		int i=100,j=200;
		System.out.println(">>> Before calling: I= "+i+" and J= "+j);
		int result = m1.sum(i, j); // method call . here i , j are actual arguments
		System.out.println(">>> After calling: I= "+i+" and J= "+j);

		System.out.println(">>> sum is "+result);
		
		System.out.println("======================================================");
		
		m1.a=1000;
		m1.b=2000;
		System.out.println(">>> Before calling: m1.a= "+m1.a+" and m1.b= "+m1.b);
		m1.sum_v1(m1); // here m1.a and m1.b are actual arguments
		System.out.println(">>> After calling: m1.a= "+m1.a+" and m1.b= "+m1.b);

		
	}

}
