package com.medha.testdemo1;

public class CarSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// public - Run from outside the class.
		// static - Run with-out an instance.
		// void- No return type.
		// main - To identify through JAVA Compiler.
		// String[] - Array of Strings - Pass as arguments.
		// Not executing test now.
		
		CarService carService = new CarService();
		for(String argument: args)
		{
			// Supply arguments - Run -> Run Configuration -> Add Arguments.
			carService.process(argument);
		}
		//carService.process("Maruti");
		
		

	}

}
