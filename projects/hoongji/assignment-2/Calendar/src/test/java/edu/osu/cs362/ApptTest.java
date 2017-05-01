package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());


	 }

    @Test
	 public void test02() throws Throwable { //test for valid
         int startHour=25;
         int startMinute=50;
         int startDay=25;
         int startMonth=3;
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

         appt.isValid();
         assertFalse(appt.getValid());


     }

    @Test
    public void test03() throws Throwable { //test for valid
        int startHour = 22;
        int startMinute = 60;
        int startDay = 25;
        int startMonth = 3;
        int startYear = 2017;

        String title = "Birthday Party";
        String description = "This is my birthday party.";

        Appt appt= new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        assertFalse(appt.getValid());
    }

    @Test
    public void test04() throws Throwable { //test for valid
        int startHour = 22;
        int startMinute = 50;
        int startDay = 0;
        int startMonth = 3;
        int startYear = 2017;

        String title = "Birthday Party";
        String description = "This is my birthday party.";

        Appt appt= new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        assertFalse(appt.getValid());
    }

    @Test
    public void test05() throws Throwable { //test for valid
        int startHour = 22;
        int startMinute = 50;
        int startDay = 25;
        int startMonth = 15;
        int startYear = 2017;

        String title = "Birthday Party";
        String description = "This is my birthday party.";

        Appt appt= new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        appt.toString();

        assertFalse(appt.getValid());
    }

    @Test
    public void test06() throws Throwable { //test for valid
        int startHour = 22;
        int startMinute = 50;
        int startDay = 25;
        int startMonth = 3;
        int startYear = 2017;

        String title = null;
        String description = null;

        Appt appt= new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        appt.setStartHour(10);
        appt.setStartDay(20);
        appt.setStartMinute(40);
        appt.setStartMonth(6);
        appt.setStartYear(2016);
        appt.setTitle(title);
        appt.setDescription(description);

        assertEquals("", appt.getTitle());
        assertEquals("", appt.getDescription());
    }

    @Test
    public void test07() throws Throwable {
        int startHour = 0;
        int startMinute = 50;
        int startDay = 25;
        int startMonth = 3;
        int startYear = 2017;

        String title = "";
        String description = "";

        Appt appt= new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

       appt.toString();

    }

    @Test
    public void test08() throws Throwable {
        int startHour = 14;
        int startMinute = 50;
        int startDay = 25;
        int startMonth = 3;
        int startYear = 2017;

        String title = "";
        String description = "";

        Appt appt = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        appt.toString();
    }


}
