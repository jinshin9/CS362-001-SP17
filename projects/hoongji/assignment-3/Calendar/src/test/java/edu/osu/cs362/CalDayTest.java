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
	public void test01() throws Throwable{

		CalDay calDay = new CalDay();

		assertNotNull(calDay.toString());

	}

	@Test
	public void test02() throws Throwable{
		CalDay calDay = new CalDay();
		calDay.iterator();

	}

	@Test
	public void test03() throws Throwable {
		Appt appt = new Appt(13, 45, 9, 04, 2017,
				"OK", "VERY OK");

		GregorianCalendar gregCal = new GregorianCalendar();
		CalDay calDay1 = new CalDay(gregCal);
		calDay1.addAppt(appt);
		calDay1.iterator();
	}

	@Test
	public void test04() throws Throwable{
		GregorianCalendar gregorianOne = new GregorianCalendar();
		CalDay calDay1 = new CalDay(gregorianOne);
		Appt appt1 = new Appt(12,31,30,01,2017,
				"OK","Very OK");
		Appt appt2 = new Appt(5,8,4,03,2017,
				"OK","Very OK");

		calDay1.addAppt(appt1);
		calDay1.addAppt(appt2);
		assertEquals(2,calDay1.getSizeAppts());

	}


	@Test
	public void test05() throws Throwable {
		GregorianCalendar gregCal = new GregorianCalendar();
		CalDay calDay1 = new CalDay(gregCal);
		Appt appt = new Appt(-1, 11, 5, 07, 2017,
				"OK","Very OK");

		assertEquals(false, appt.getValid());

		calDay1.addAppt(appt);
	}

	@Test
	public void test06() throws Throwable{
		GregorianCalendar gregCal = new GregorianCalendar();
		CalDay calDay1 = new CalDay(gregCal);
		Appt appt1 = new Appt(3,5,13,05,2017,
				"OK","Very OK");
		Appt appt2 = new Appt(4,14,21,02,2017,
				"OK","Very OK");

		calDay1.addAppt(appt1);
		calDay1.addAppt(appt2);
		calDay1.iterator();
		calDay1.toString();
	}

	@Test
	public void test07()  throws Throwable  {

		CalDay calDay = new CalDay();
		assertFalse(calDay.isValid());

		GregorianCalendar gregCal = new GregorianCalendar();
		CalDay calDay1 = new CalDay(gregCal);

		assertEquals(calDay1.getDay(),gregCal.get(gregCal.DAY_OF_MONTH));
		assertEquals(calDay1.getMonth(),gregCal.get(gregCal.MONTH));
		assertEquals(calDay1.getYear(),gregCal.get(gregCal.YEAR));
	}

	@Test
	public void test08() throws Throwable{
		GregorianCalendar gregCal = new GregorianCalendar();
		CalDay calDay1 = new CalDay(gregCal);
		Appt appt1 = new Appt(12,10,6,07,2017,
				"OK","Very OK");
		Appt appt2 = new Appt(11,10,9,03,2017,
				"OK","Very OK");
		calDay1.addAppt(appt2);
		calDay1.addAppt(appt1);
		assertEquals(11,calDay1.getAppts().getFirst().getStartHour());

	}


	@Test
	public void test09() throws Throwable{
		GregorianCalendar gregCal = new GregorianCalendar();
		CalDay calDay1 = new CalDay(gregCal);
		Appt appt1 = new Appt(12,12,22,03,2017,
				"OK","Very OK");
		Appt appt2 = new Appt(12,12,24,04,2017,
				"OK","Very OK");

		calDay1.addAppt(appt1);
		calDay1.addAppt(appt2);
		assertEquals(03,calDay1.getAppts().get(0).getStartMonth());


	}

	@Test
	public void test10() throws Throwable{
		Appt appt = new Appt(10,12,22,03,2017,
				"merry","Need to merry");

		GregorianCalendar gregCal = new GregorianCalendar();
		CalDay calDay1 = new CalDay(gregCal);
		calDay1.addAppt(appt);
		assertNotNull(calDay1.iterator());

	}



	}
