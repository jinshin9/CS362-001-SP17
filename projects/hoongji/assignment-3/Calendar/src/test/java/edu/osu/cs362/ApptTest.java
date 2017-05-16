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

		 Appt appt = new Appt(13, 30, 10, 4, 2017, "Birthday Party", "This is my birthday party.");

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

         Appt appt = new Appt(15, 50, 25, 3, 2017, "Birthday Party", "This is my birthday party.");

         appt.isValid();
         assertTrue(appt.getValid());

     }

    @Test
    public void test03() throws Throwable { //test for valid

        Appt appt= new Appt(22, 60, 25, 3,2017, "Birthday Party", "This is my birthday party.");

        assertFalse(appt.getValid());
    }

    @Test
    public void test04() throws Throwable { //test for valid

        Appt appt= new Appt(22, 50, 0, 3, 2017 ,"Birthday Party", "This is my birthday party.");

        assertFalse(appt.getValid());
    }

    @Test
    public void test05() throws Throwable { //test for valid

        Appt appt= new Appt(22, 50, 25, 15, 2017, "Birthday Party", "This is my birthday party.");

        appt.toString();

        assertFalse(appt.getValid());
    }

    @Test
    public void test06() throws Throwable { //test for valid

        Appt appt= new Appt(22, 50, 25, 3, 2017, null, null );

        appt.setStartHour(10);
        appt.setStartDay(20);
        appt.setStartMinute(40);
        appt.setStartMonth(6);
        appt.setStartYear(2016);
        appt.setTitle(null);
        appt.setDescription(null);

        assertEquals("", appt.getTitle());
        assertEquals("", appt.getDescription());
    }

    @Test
    public void test07() throws Throwable {

        Appt appt= new Appt(0, 50, 25, 3, 2017, "", "");

       appt.toString();

    }

    @Test
    public void test08() throws Throwable {

        Appt appt = new Appt(14, 50, 25, 3, 2017, "", "");

        appt.toString();
    }

    @Test
    public void test09() throws Throwable {

        Appt appt = new Appt(20, 44, 8, 3, 2017, "", "");

        appt.setStartHour(23);
        assertEquals(true, appt.getValid());
        appt.setStartHour(0);
        assertEquals(true, appt.getValid());

    }

    @Test
    public void test09a() throws Throwable {
        Appt appt = new Appt(20, 44, 8, 3, 2017, "", "");

        appt.setStartHour(-1);
        assertEquals(false, appt.getValid());
        appt.setStartHour(24);
        assertEquals(false, appt.getValid());

	 }

    @Test
    public void Test10() throws Throwable{

        Appt appt = new Appt(20, 44, 8, 3, 2017, "", "");

        appt.setStartMinute(0);
        assertEquals(true, appt.getValid());
        appt.setStartMinute(59);
        assertEquals(true, appt.getValid());

    }

    @Test
    public void Test10a() throws Throwable{

        Appt appt = new Appt(20, 44, 8, 3, 2017, "", "");

        appt.setStartMinute(-1);
        assertEquals(false, appt.getValid());
        appt.setStartMinute(60);
        assertEquals(false, appt.getValid());

    }


    @Test
    public void Test11() throws Throwable {

        Appt appt = new Appt(20, 44, 8, 3, 2017, "", "");

        appt.setStartDay(1);
        assertEquals(true, appt.getValid());
        appt.setStartDay(31);
        assertEquals(true, appt.getValid());
    }

    @Test
    public void Test11a() throws Throwable {

        Appt appt = new Appt(20, 44, 8, 3, 2017, "", "");

        appt.setStartDay(0);
        assertEquals(false, appt.getValid());
        appt.setStartDay(32);
        assertEquals(false, appt.getValid());
    }

    @Test
    public void Test12() throws Throwable {

        Appt appt = new Appt(20, 44, 8, 3, 2017, "", "");

        appt.setStartMonth(1);
        assertEquals(true, appt.getValid());
        appt.setStartMonth(12);
        assertEquals(true, appt.getValid());
    }

    @Test
    public void Test12a() throws Throwable {

        Appt appt = new Appt(20, 44, 8, 3, 2017, "", "");

        appt.setStartMonth(0);
        assertEquals(false, appt.getValid());
        appt.setStartMonth(13);
        assertEquals(false, appt.getValid());
    }

    @Test
    public void Test13() throws Throwable {

        Appt appt = new Appt(20, 44, 8, 3, 2017, "", "");

        appt.setStartYear(2016);
        assertEquals(true, appt.getValid());

    }

    @Test
    public void Test14() throws Throwable {

        Appt appt = new Appt(61, 44, 8, 3, 2017, "", "");

        assertEquals(null, appt.toString());
    }

    @Test
    public void Test15() throws Throwable {
        Appt appt = new Appt(11, 44, 8, 3, 2017, "Meeting", "A group meeting with Mortar Board.");

        assertEquals("\t3/8/2017 at 11:44am ,Meeting, A group meeting with Mortar Board.\n", appt.toString());

    }

    @Test
    public void Test16() throws Throwable {
        Appt appt = new Appt(12, 44, 8, 3, 2017, "Meeting", "A group meeting with Mortar Board.");

        assertEquals("\t3/8/2017 at 12:44pm ,Meeting, A group meeting with Mortar Board.\n", appt.toString());

    }

    }
