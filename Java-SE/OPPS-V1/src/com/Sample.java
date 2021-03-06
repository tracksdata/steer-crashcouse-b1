package com;


public class Sample {
	
	/*
	 *  1. fields -  behaviour
	 *  2. methods - actions
	 *  
	 * 		-> fields have common behaviour across all objects
	 * 		-> methods changes  behaviour of fields of a object
	 * 
	 * 
	 *  instance Fields
	 *  -----------------
	 *  	-> instance fields are unique to across objects
	 *  	-> instance data must be accessed with a object from static methods
	 *  	-> instance data never accessible from static methods
	 *  	-> to access instance data from static methods we need object creation
	 *  	
	 *  	When to create object?
	 *  ===============================
	 *  	=> to access instance data from a static method of the same class
	 * 		=> to access instance data from a static / non-static methods from other classes
	 * 
	 *    How to access static data?
	 *    =============================
	 *    => static data directly accessible to static and non static methods in the same class 
	 *    => static data must be called/accessed with class name from other class methods
	 *      
	 *     Summary
	 *     ==========
	 *     1. instance data unique to every object
	 *     2. static data is common to all objects
	 *     3. static methods never allow non static data directly
	 *     4. to access non static data from a static method, object is required
	 *     5. static data directly accessible to static methods of same class
	 *     6. static data must be invoked / accessed from other classes with class name
	 *     
	 *      
	 */

	// instance fields
	int x; // instance field
	static int y; // static field
	
	void t1() {
		
	}

	void f1() { // instance method
		t1();
		Sample.y=2000;
		x=10; // to access this x, object not required
		System.out.println(">>>> instance method f1");
	}

	static void f2() { // static method f2
		
		y=1000;
		Sample s1=new Sample();
		s1.x=15;
		s1.t1();
		
		//System.out.println(">>> static metgod f2");
		//PrintStream ps = System.out;
		//ps.println();
		System.out.println("Helooo");
		
	}

	public static void main(String[] args) {

		System.out.println(Math.max(1000, 6500));
		System.out.println(Math.sqrt(100));

	}
}


class C1{
	
	/*
	 * In other classes, 
	 * 	-> static data must be invoked by name of class
	 * 	-> non static data must be invoked by object name.
	 * 
	 */
	
	void f3() {
		Sample.f2();
		Sample.y=5000;
		
		Sample s=new Sample();
		s.x=10;
	}
	
}
