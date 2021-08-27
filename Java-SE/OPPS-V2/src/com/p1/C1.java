package com.p1;

import com.Test;
import com.p1.p2.C2;

public class C1 extends Test{ // here c1 is sub class, and Test is super class
	
	public static void main(String[] args) {
		
		C2 c2Obj=new C2();
		//c2Obj.c2(); exception
		
		
		Test t=new Test();
		t.f1();
		//t.f2(); // error. Because f2 is default method
		//t.f3(); // error. f3 is protected method
		//t.f4(); // error f4 is private method
		
		C1 c1=new C1();
		c1.f1();// public
		//c1.f2();
		c1.f3(); // protected. 
		
		
		
	}

}
