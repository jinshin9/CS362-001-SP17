package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;
import org.omg.PortableServer.ThreadPolicyOperations;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {

		 //Collection of all of the appointments for the calendar day *
	 	LinkedList<Appt> listAppts = new LinkedList<Appt>();

	 	//Create an appt
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

		 //Add appt to list
		 listAppts.add(appt);

		 //Create another appt
		 startHour=10;
		 startMinute=33;
		 startDay=26;
		 startMonth=7;
		 startYear=2017;

		 //Add appt to list
		 appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 listAppts.add(appt);

	 	//Get the day now
		 Calendar rightnow = Calendar.getInstance();
		 //current month/year/date is today
		 int thisMonth = rightnow.get(Calendar.MONTH)+1;
		 int thisYear = rightnow.get(Calendar.YEAR);
		 int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		 GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		 tomorrow.add(Calendar.DAY_OF_MONTH,1);

		 LinkedList<CalDay> calDays = new LinkedList<CalDay>();

		 TimeTable timeTable = new TimeTable();


		 calDays=timeTable.getApptRange(listAppts,today,tomorrow);
	 }

	 @Test
	public void test02() throws Throwable {

		 //Test for null apt
		 Appt appt = null;

		 LinkedList<Appt> apptList = new LinkedList<Appt>();

		 apptList = null;

		 TimeTable timeTable = new TimeTable();

		 timeTable.deleteAppt(apptList,appt);

	 }


	 @Test
	public void test03() throws Throwable{

		 int startHour=30;
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

		 appt.getValid(); //return false

		 LinkedList<Appt> apptList = new LinkedList<Appt>();

		 TimeTable timeTable = new TimeTable();

		 timeTable.deleteAppt(apptList,appt);

		 timeTable.deleteAppt(apptList,appt);

	}

	@Test
	public void test04() throws Throwable {

	}

	@Test
	public void test05() throws Throwable {
		//Internal Diagnostic Messages turned on when true
		boolean diagnose = true;

		/** Collection of all of the appointments for the calendar day */
		LinkedList<Appt> listAppts = new LinkedList<Appt>();

		int thisMonth;
		int thisYear;
		int thisDay;

		//get todays date
		Calendar rightnow = Calendar.getInstance();
		//current month/year/date is today
		thisMonth = rightnow.get(Calendar.MONTH)+1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);


		int startHour=15;
		int startMinute=30;
		int startDay=thisDay; 		//11
		int startMonth=thisMonth; 	//4
		int startYear=thisYear;	//2017
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		listAppts.add(appt);

		// create another appointment
		startHour=14;
		startMinute=30;
		startDay=thisDay;  	//11
		startMonth=thisMonth; 	//4
		startYear=thisYear; 	//2017
		title="Class";
		description="Rescheduled class.";
		//Construct a new Appointment object with the initial data
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		listAppts.add(appt);
		// create another appointment
		startHour=13;
		startMinute=30;
		startDay=thisDay;		//11
		startMonth=thisMonth;	//4
		startYear=thisYear;	//2017
		title="Meeting Today";
		description="Meeting with the students.";
		//Construct a new Appointment object with the initial data
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		listAppts.add(appt);


		//get a list of appointments for one day, which is today
		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,1);

		TimeTable timeTable=new TimeTable();
		//Create a linked list of calendar days to return
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);

		LinkedList<Appt> listUpdatedAppts=timeTable.deleteAppt(listAppts, appt);



	}

}
