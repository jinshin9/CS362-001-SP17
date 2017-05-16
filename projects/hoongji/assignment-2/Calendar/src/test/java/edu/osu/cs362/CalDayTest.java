package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


import org.junit.Test;
import sun.awt.image.ImageWatched;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=15;
		 int startMinute=30;
		 int startDay=25;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";

		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 LinkedList appts = new LinkedList();

		 appts.add(appt);

		 GregorianCalendar cal = new GregorianCalendar(startYear, startMonth, startDay);

		 CalDay calDay = new CalDay(cal);

		 appt.getValid();

		 calDay.addAppt(appt);

		 //Create another appt
		 startHour=10;
		 startMinute=30;
		 startDay=25;
		 startMonth=4;
		 startYear=2017;
		 title="Birthday Party";
		 description="This is my birthday party.";

		 appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 calDay.addAppt(appt);

		 calDay.getSizeAppts();

		 calDay.getDay();

		 calDay.getMonth();

		 calDay.getYear();

		 calDay.isValid();

		 calDay.toString();


		 assertEquals(2, calDay.getSizeAppts());
		 assertEquals(25, calDay.getDay());
		 assertEquals(4, calDay.getMonth());
		 assertEquals(2017, calDay.getYear());
	 }

	 @Test //Test iterating
	public void test02() throws Throwable {

	 	GregorianCalendar cal = new GregorianCalendar(2017, 4, 25);
	 	CalDay calDay = new CalDay(cal);
	 	
	 	calDay.iterator();

		 GregorianCalendar cal1 = new GregorianCalendar(2017, 14, 25);
		 CalDay calDay1 = new CalDay(cal1);

		 calDay1.valid = false;
		 calDay1.isValid();

		 calDay1.iterator();

	 }

	 @Test
	public void test03() throws Throwable {

	 	CalDay calDay = new CalDay();

	 	calDay.toString();
	 }

	 @Test
	public void test04() throws Throwable {

		 CalDay calDay = new CalDay();

		 int startHour=40;
		 int startMinute=66;
		 int startDay=36;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";

		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 calDay.addAppt(appt);

	 }

	 @Test
	public void test06() throws Throwable {

		 int startHour=15;
		 int startMinute=30;
		 int startDay=25;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";

		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 LinkedList<Appt> listAppts = new LinkedList<Appt>();

		 listAppts.add(appt);

		 CalDay calDay = new CalDay();

		 calDay.appts = listAppts;

		 calDay.addAppt(appt);


		 startHour=12;
		 startMinute=30;
		 startDay=25;
		 startMonth=4;
		 startYear=2017;
		 title="Birthday Party";
		 description="This is my birthday party.";

		 Appt appt1 = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 listAppts.add(appt);

		 calDay.addAppt(appt1);

		 calDay.toString();





	 }

	
}
