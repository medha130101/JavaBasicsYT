package com.medha.testdemo1;

import org.junit.Test;

public class CarServiceTest {
	
	@Test
	public void shouldDemonstrateLogging()
	{
		// CarService-class
		// carService - VAR
		CarService carService = new CarService();
		// Not CarService.process as it is static reference.
		carService.process("BMW");
		
	}
	
	@Test
	public void asMain()
	{
		String[] arguments = { "KIA" , "MG" };
		CarSelect.main(arguments);
	}

}
