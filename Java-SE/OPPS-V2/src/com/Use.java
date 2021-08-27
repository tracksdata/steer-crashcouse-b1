package com;

public class Use {
	
	/*
	 * Notes
	 * ---------
	 * 1. public
	 * 	-> public data is visible to all the packages
	 * 2. default
	 * 	-> visible to classes from same package. other package classes can not see default data
	   3. protected
	    -> visible to classes from same package.
	    -> Sub classes of other package classes can access protected data
	   4. private
	   	-> visible to the same class where it is declared. 
	   	-> classes of same package or other package can not access private data
	   	
	 */
	
	public static void main(String[] args) {
		
		Test t1=new Test();
		t1.f1(); // public
		t1.f2(); // default
		t1.f3(); // protected
		//t1.f4(); // private method
		
		
	}

}
