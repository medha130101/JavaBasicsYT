package com.medha.testdemo1;


// enum - Our own Data Type.
// Logging Level is an 'enum'
public enum LoggingLevel {
// Every enum constant is implicitly public static final.
// static - Access using enum name.
// final - No child enums exist.
// Better than C/C++ - Add variables, methods and constructors to enum.
	//Adding enumeration values to list.
	
	//READY, PROCESSING, DEAD;
	
	READY(1), PROCESSING(2), DEAD(3);
	
	private int i;
	
	// Define Constructor accordingly.
	
		private LoggingLevel(int i)
		{
			this.i = i;
		}
		
	// Method to define and return values.
	public int code()
	{
		return i;
	}
	

}
