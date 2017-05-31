package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;
import sun.awt.SunHints;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

	private static final int NUM_TESTS=500; //Constant to run the loop

	long randomseed =10;
	Random random = new Random(randomseed);

	//Create random appt
	public static Appt makeAppt(Random random) {

		int hour = ValuesGenerator.getRandomIntBetween(random, -5, 30);
		int min = ValuesGenerator.getRandomIntBetween(random, -5, 70);
		int day = ValuesGenerator.getRandomIntBetween(random, -5, 35);
		int month = ValuesGenerator.getRandomIntBetween(random, -5, 18);
		int year = ValuesGenerator.getRandomIntBetween(random, -1, 2020);

		return new Appt(hour, min, day, month, year, "", "");
	}


	 @Test //test for deleteAppt
	 public void randomtest() throws Throwable {

		 //Create a timetable and the calendar
		 TimeTable table = new TimeTable();
		 GregorianCalendar date1 = new GregorianCalendar(2015,4, 30);
		 GregorianCalendar date2 = new GregorianCalendar(2016, 3, 4);

		 CalDay calday = new CalDay(new GregorianCalendar(ValuesGenerator.getRandomIntBetween(random, 2000,2017), ValuesGenerator.getRandomIntBetween(random, 1, 12), ValuesGenerator.getRandomIntBetween(random,1,28)));

		 //Create appt objects
		 Appt appt1 = null;
		 Appt appt2 = null;

		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 //Run for 500 times
		 for (int i = 0; i < NUM_TESTS; i++) {
			 //Create random appt
			 appt1 = TimeTableRandomTest.makeAppt(random);

			 appt2 = TimeTableRandomTest.makeAppt(random);

			 //Testing different branches
			 table.deleteAppt(appts, appt1);
			 appts.add(appt1);
			 table.deleteAppt(appts, null);
			 appts.add(appt2);

			 calday.addAppt(appt1);
			 calday.addAppt(appt2);

		 table.getApptRange(appts, date1, date2);
		 table.deleteAppt(appts, appt1);
		 table.deleteAppt(null,null);

	 	}
	 }
}




