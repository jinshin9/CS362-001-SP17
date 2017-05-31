package edu.osu.cs362;


import org.junit.Test;
import sun.awt.SunHints;


import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

	private static final int NUM_TESTS=500;
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test //Test for addAppt
	  public void randomtest()  throws Throwable  {

		 long randomseed =10;
		 Random random = new Random(randomseed);

		 //Create CalDay object
		 GregorianCalendar cal = new GregorianCalendar(2016, 10, 24);
		 CalDay calDay = new CalDay(cal);

		 //Run 500 times of randomly generated numbers for appt attributes
		 for (int i = 0; i < NUM_TESTS; i++ ) {

			int hour = ValuesGenerator.getRandomIntBetween(random, -5, 30);
			int min = ValuesGenerator.getRandomIntBetween(random, -5, 70);
			int day = ValuesGenerator.getRandomIntBetween(random, -5, 35);
			int month = ValuesGenerator.getRandomIntBetween(random, -5, 18);
			int year = ValuesGenerator.getRandomIntBetween(random, -1, 2020);

			Appt appt = new Appt(hour, min, day, month, year, "", "");

			calDay.addAppt(appt);
		}
		 
	 }

	
}
