package com.medha.testdemo1;

// Static Import

import static org.junit.Assert.assertEquals;

// General Import
import org.junit.Test;
// junit is a testing framework - toolset

public class PersonTest {
	
	private static final String[] MY_STATE_VALUES = {"READY","PROCESSING","DEAD"};
	private static final int FIRSTSTATE = 10;
	private static final int PROCESSING = 20;
	private static final int DEAD = 30;
	@SuppressWarnings("unused")
	private static final String READY = "START";
	
	
	
		@Test
		public void testReturnHelloWorld() {
			
			Person medha = new Person();
			// VAR NAME - medha 
			// Used a REF to allocated memory location
			assertEquals("Hello World",medha.helloworld());
			// Call the method - helloworld().
			// The output is set equivalent to asserting Hello World as it is the returned string.
			// The output is all tests passed or not by @Test
			System.out.println("Hello World");
		}
		
		@Test
		public void testReturnMedha() {
			Person person1 = new Person();
			// Add Default Constructor, else error exists
			//Person person2 = new Person();
			assertEquals("Hello Medha", person1.hello("Medha"));
			//assertEquals("Hello Medha", person2.hello("Medha"));
			
		}
		
		@Test
		public void testReturnCountofPerson() {
			//Person person1 = new Person();
			//Person person2 = new Person();
			//Person lastPerson = new Person();
			
			// Use loop 
			@SuppressWarnings("unused")
			Person lastPerson;
			for( int i = 0; i < 4; i++) {
				lastPerson = new Person();
			}
			// Only access the last person, as rest are overwritten.
			// A static method does not calls the method on the object and hence is irrespective of the object.
			// Person, itself is used to access static function statically.
			System.out.println(Person.CountofPerson());
			//assertEquals(9, Person.CountofPerson());
			
			//System.out.println(lastPerson.CountofPerson());
		}
		
		@Test
		public void testReturnLoopCountofPerson() {
			int  i = 0;
			@SuppressWarnings("unused")
			Person lastPerson;
			 while ( i < 4)
			 {
				 lastPerson = new Person();
				 i++;
			 }
			 System.out.println(Person.CountofPerson());
			// Only access the last person, as rest are overwritten.
			// A static method does not calls the method on the object and hence is irrespective of the object.
			// Person, itself is used to access static function statically.
			//assertEquals(5, Person.CountofPerson());
			//System.out.println(lastPerson.CountofPerson());
		}
		
		@Test
		public void testBoolean() {
			//boolean b = false;
			boolean mon = false;
			boolean tues = true;
			boolean fri = true;
			boolean sun  = false;
			boolean rain = false;
			// OR (||) and AND (&&)
			if(mon && rain || tues && sun) {
				System.out.println("Its Monday and Raining or Tuesday and Sunny");
			}
			else if(tues)
			{
				System.out.println("Did not check next, its Tuesday.");
			}
			else if(fri) 
			{
				System.out.println("Go to Sleep, its Friday");
			}
			else
			{
				System.out.println("No clue of what it is ?");
			}
			
		}
		@Test
		public void testBooleanNext() {
			
			int i = 4;
			int j = 5;
			boolean areEqual = i == j ;
			// <> and != are Not Equal
			if( i > j) {
				
				System.out.println("i > j");
				
			} 
			else if(j > i ) {
				
				System.out.println("j > i");
			} 
			else if (areEqual)
			{
				System.out.println("Equal");
				
			}
			else
			{
				System.out.println("Not Any");
			}
			
			
		}
		
	@Test
	public void TestForArrays() {
		Person[] persons = new Person[4];
		//persons[0] = new Person();
		//persons[1] = new Person();
		//persons[2] = new Person();
		//persons[3] = new Person();
		 // Loop
		for(int i =0; i < persons.length ;  i++)
		{
			//Person person = new Person();
			//persons[i] = person;
			
			//OR
			
			persons[i] = new Person();
			
		}
		
		// For each loop
		// IMPORTANT
		for(Person person: persons)
		{
			//System.out.println(person.helloworld());
			person.helloworld();
		}
		
		// Array , unspecified size.
		@SuppressWarnings("unused")
		final Person[] personenum = {persons[0], persons[1]};
		// 'final' modifier protects futher assignment
		//personenum = null;
		// Use with static final VARs.
		
		for (String state: MY_STATE_VALUES)
		{
			if(state.equals("READY")) {
				System.out.println("READY");
			}
		}
		
		// Use a class as a enumerator.
		//LoggingLevel state = LoggingLevel.READY;
		// Iterate over the enum list.
		for(LoggingLevel state: LoggingLevel.values())
		{
			// Each label(enum as READY,PROCESSING & DEAD) can be utilized in code.
			if(state == LoggingLevel.DEAD)
			{
				System.out.println(LoggingLevel.DEAD);
				// Get code output.
				System.out.println(LoggingLevel.DEAD.code());
			}	
		}
		
		//if("ABC" == "ABC")
		// Comparison of String Objects
		String myString = "ABC";
		// if myString is NULL, myString.equals("ACB")- Error
		//System.out.println(myString.equals("ABC"));
		// Better Approach - Put the string first which can never be NULL.
		System.out.println("ABC".equals(myString));
		if("ABC".equals("ACB"))
		{
			System.out.println("Works");
		}
		
		LoggingLevel state= LoggingLevel.READY;
		// As CASE-1 for READY is TRUE, enter and execute, exit by break else code for CASE-2 & CASE-3 execute.
		switch(state)
		{
		case READY:
			System.out.println(state);
			//System.out.println("READY");
			break; /* Code falls through*/
		case PROCESSING:
			System.out.println(state);
			//System.out.println("PROCESSING");
			break;
		case DEAD:
			System.out.println(state);
			//System.out.println("DEAD");
			break;
		default:
			System.out.println("DEFAULT");
			//Get error or throw an exception to add relevant case as CASE statement.
		
		}
		
		//String myString1 = "myString";
		// Iterate over integer values( or equivalent string) with each CASE as STRING.
		int levelValue = FIRSTSTATE; 
		switch(levelValue)
		{
			//case 10:
		case FIRSTSTATE:
				System.out.println(levelValue);
				break;
		case PROCESSING:
			//case 20:
				System.out.println(levelValue);
				break;
		case DEAD:
			//case 30:
				System.out.println(levelValue);
				break;
				
		// ERROR - Use string iterator to iterate over values.
		//case READY:
				//System.out.println(levelValue);
		}
		
		// Iterate over string values with each case as STRING.
		// Note - READY is a string.
		
		String myString1 = "FIRSTSTATE";
		switch(myString1)
		{
		case "FIRSTSTATE":
			System.out.println(myString1);
			break;
		case "PROCESSING":
			System.out.println(myString1);
			break;
		case "DEAD":
			System.out.println(myString1);
			break;
		case "READY":
			System.out.println(myString1);
		
		}
		
		// enum type , pass as argument to 'switch' statement.
		
		
		
		
		
		
	}
		
}

