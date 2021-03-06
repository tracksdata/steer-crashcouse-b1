package com;

public class Person {

	int id; // 0
	String name; // null
	
	/*
	 * constructor
	 * -------------
	 * -> constructor name must be same as class name.
	 * -> special block in java which invokes when ever object is created 
	 * -> constructor never return anything. not even 'void'
	 * 
	 * Types of constructor: 2 types
	 * ================================
	 * 	1. default constructor (with out any arguments)
	 *  2. argument constructor
	 *  
	 *  Note:
	 *  -> JMV adds a default constructor on its own when you don't provide any default constructor
	 *  -> JVM never adds default constructor when you provide argument constructor 
	 */
	
	/*
	Person(){
		// if you want to initialise any thing of class before the created object is used.
		System.out.println(">>> Person Object is created..");
	}
	*/
	
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
 
	void setData(int id, String name) { // here id and name are local to the setData method
		this.id = id; // which one is local and which one is class level field?
		this.name = name;
	}

	void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		Person p1=new Person(10,"Praveen");
		//p1.setData(10, "Praveen");
		p1.display();

	}

}
