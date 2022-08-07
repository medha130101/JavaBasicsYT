package com.medha.testdemo1;


// Need to import a class from a different package, if the package is distinct from the root package
import com.medha.testdemo2.Name;

public class Person {
	
	private Name personName;
	// personName is a reference to object of type 'Name' - Instance VAR.
	static private int personCounter;
	
	public String helloworld() {
		// TODO Auto-generated method stub
	// Instance Method
		return "Hello World";
	}
	
	
	// Not Default Constructor
	public Person(Name personName) {
		// Set the value of Instance Variables, use 'this'.
		// this - To refer to current class instance variables.
		this.personName = personName;
		//or change VAR Name
		
	}
	
	
	// Add Default Constructor
	public Person() {
	/* Empty on Purpose */
		personCounter++;
	}
	
	public Name name() {
		
		return personName;
	}


	public String hello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
		// Concatenate String
	}

// Declaration of a Static Method
// As the method is static it is independent of the object or instance, but is a part of class.
	public static int CountofPerson() {
		// TODO Auto-generated method stub
		// To count, keep count at default constructor revoked.
		return personCounter;
	}
	

}
