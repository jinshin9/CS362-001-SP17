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
	public void test01() throws Throwable{

		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt>appts = new LinkedList<Appt>();
		Appt appt = null;
		appts.add(appt);
		timeTable1.deleteAppt(appts,appt);

	}

	@Test
	public void test02() throws Throwable{

		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt>appts = new LinkedList<Appt>();

		Appt appt1 = new Appt(4,34,9,4,2017,
				"Ali Baba","with sesame door.");
		Appt appt2 = new Appt(5,16,2,7,2017,
				"You","AND I");
		Appt appt3 = new Appt(8,12,22,03,2017,
				"Mickey","mouse");

		appts.add(appt1);
		appts.add(appt2);
		appts.add(appt3);
		timeTable1.deleteAppt(appts,appt3);

	}


	@Test
	public void test04() throws Throwable{

		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt>appts = new LinkedList<Appt>();
		Appt appt = new Appt(4,34,9,4,2017,
				"Ali Baba","with sesame door.");
		timeTable1.deleteAppt(appts,appt);

	}

	@Test
	public void test05() throws Throwable{

		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt>appts = null;
		Appt appt = new Appt(4,34,9,4,2017,
				"Ali Baba","with sesame door.");
		timeTable1.deleteAppt(appts,appt);

	}

	@Test
	public void test06() throws Throwable{

		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt>appts = new LinkedList<Appt>();
		Appt appt = new Appt(-1,11,4,1,2016,"Ali Baba","with sesame door.");
		timeTable1.deleteAppt(appts,appt);

	}

	@Test
	public void test07() throws Throwable{

		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appt1 = new Appt(11,9,2,4,2016,"Arya","loves poo poo.");
		Appt appt2 = new Appt(2,11,2,3,2016,"Arya","loves poo poo.");
		appts.add(appt1);
		appts.add(appt2);

		GregorianCalendar gregOne = new GregorianCalendar(2016,3,1);
		GregorianCalendar gregTwo = new GregorianCalendar(2016,5,4);
		timeTable1.getApptRange(appts,gregOne,gregTwo);
	}


	@Test
	public void test08()throws Throwable {

		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appt1 = new Appt(9, 11, 1, 3, 2016, "Arya","loves poo poo.");
		Appt appt2 = new Appt(3, 11, 1, 3, 2016, "Arya","loves poo poo.");
		appts.add(appt1);
		appts.add(appt2);

		GregorianCalendar gregOne = new GregorianCalendar(2016, 4, 3);
		GregorianCalendar gregTwo = new GregorianCalendar(2015, 5, 4);

		try {
			timeTable1.getApptRange(appts, gregOne, gregTwo);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void test09()throws Throwable{

		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appt1 = new Appt(10,10,3,4,2016,"Arya","loves poo poo.");
		Appt appt2 = new Appt(-1,10,3,4,2016,"Arya","loves poo poo.");
		appts.add(appt1);
		appts.add(appt2);

		GregorianCalendar gregOne = new GregorianCalendar(2016,4,3);
		GregorianCalendar gregTwo = new GregorianCalendar(2016,5,4);
		timeTable1.getApptRange(appts,gregOne,gregTwo);
	}




	@Test
	public void test10() throws Throwable{
		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appt1 = new Appt(12,7,5,1,2016,"Arya","loves poo poo.");
		Appt appt2 = new Appt(2,9,6,2,2016,"Arya","loves poo poo.");

		GregorianCalendar gregOne = new GregorianCalendar(2016,2,3);
		GregorianCalendar gregTwo = new GregorianCalendar(2016,3,4);
		timeTable1.getApptRange(appts,gregOne,gregTwo);
	}


	@Test
	public void test11()throws Throwable{
		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt>appts = new LinkedList<Appt>();
		Appt appt = new Appt(13,15,2,8,2016,"Arya","loves poo poo.");
		appts.add(appt);
		Appt appt2 = new Appt(5,17,3,4,2016,"Arya","loves poo poo.");
		assertNull(timeTable1.deleteAppt(appts,appt2));

	}

	@Test
	public void test12() throws Throwable{
		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt>appts = new LinkedList<Appt>();
		Appt appt = new Appt(12,10,2,4,2016,"Arya","loves poo poo.");
		appts.add(appt);

		Appt appt2 = new Appt(3,6,3,4,2016,"Arya","loves poo poo.");
		assertNotNull(timeTable1.deleteAppt(appts,appt));

	}

	@Test
	public void test13() throws Throwable{
		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appt1 = new Appt( 2,10,7,2,2016,"Arya","loves poo poo.");
		Appt appt2 = new Appt(11,5,8,2,2016,"Arya","loves poo poo.");
		appts.add(appt1);
		appts.add(appt2);

		GregorianCalendar gregOne = new GregorianCalendar(2016,4,2);
		GregorianCalendar gregTwo = new GregorianCalendar(2016,6,4);

		assertNotNull(timeTable1.getApptRange(appts,gregOne,gregTwo));

	}

	@Test
	public void test14()throws Throwable{
		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appt1 = new Appt( 1,8,2,3,2016,"Arya","loves poo poo.");
		Appt appt2 = new Appt(10,10,1,8,2016,"Arya","loves poo poo.");
		appts.add(appt1);
		appts.add(appt2);

		GregorianCalendar gregOne = new GregorianCalendar(2016,2,3);
		GregorianCalendar gregTwo = new GregorianCalendar(2016,5,1);

		assertNotNull(timeTable1.getApptRange(appts,gregOne,gregTwo));

	}

	@Test
	public void test15() throws Throwable{
		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appt1 = new Appt( 1,10,2,6,2017,"Arya","loves poo poo.");
		Appt appt2 = new Appt(8,6,1,2,2016,"Arya","loves poo poo.");
		appts.add(appt1);
		appts.add(appt2);

		GregorianCalendar gregOne = new GregorianCalendar(2016,4,3);
		GregorianCalendar gregTwo = new GregorianCalendar(2016,5,4);

		assertNotNull(timeTable1.getApptRange(appts,gregOne,gregTwo));

	}

	@Test
	public void test16() throws Throwable{
		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appt1 = new Appt( 1,9,2,6,2016,"Arya","loves poo poo.");
		Appt appt2 = new Appt(10,10,5,8,2016,"Arya","loves poo poo.");
		appts.add(appt1);
		appts.add(appt2);

		GregorianCalendar gregOne = new GregorianCalendar(2015,4,3);
		GregorianCalendar gregTwo = new GregorianCalendar(2016,5,4);

		try {
			assertNotNull(timeTable1.getApptRange(appts,gregOne,gregTwo));
		}catch (IllegalArgumentException e){
			e.printStackTrace();
		}
	}

	@Test
	public void test17(){
		TimeTable timeTable1 = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appt1 = new Appt( 1,9,2,6,2016,"Arya","loves poo poo.");
		Appt appt2 = new Appt(10,10,5,8,2016,"Arya","loves poo poo.");
		appts.add(appt1);
		appts.add(appt2);

		GregorianCalendar gregOne = new GregorianCalendar(2017,4,3);
		GregorianCalendar gregTwo = new GregorianCalendar(2016,5,4);

		try {
			assertNotNull(timeTable1.getApptRange(appts,gregOne,gregTwo));
		}catch (IllegalArgumentException e){
			e.printStackTrace();
		}
	}



}
