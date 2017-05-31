package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;
import sun.awt.SunHints;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	//private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=500;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setStartHour", "setStartMinute", "setStartDay", "setStartMonth", "setStartYear", "setTitle","setDescription", "getValid"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 
		 System.out.println("Start testing...");

			//for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;//System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);

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


				for (int i = 0; i < NUM_TESTS; i++) {

					//Randomly select the method
					String methodName = ApptRandomTest.RandomSelectMethod(random);

					//System.out.println(methodName);

					if (methodName.equals("setStartHour")) {
						appt.setStartHour(ValuesGenerator.getRandomIntBetween(random, -10, 30));
					}

					if (methodName.equals("setStartMinute")) {
						appt.setStartMinute(ValuesGenerator.getRandomIntBetween(random, -12, 70));
					}

					if (methodName.equals("setStartDay")) {
						appt.setStartDay(ValuesGenerator.getRandomIntBetween(random, -8, 40));
					}

					if (methodName.equals("setStartMonth")) {
						appt.setStartMonth(ValuesGenerator.getRandomIntBetween(random, -9, 20));
					}

					if (methodName.equals("setStartYear")) {
						appt.setStartYear(ValuesGenerator.getRandomIntBetween(random, -1, 2020));
					}

					if (methodName.equals("setTitle")){
						   //String newTitle=(String) ValuesGenerator.getString(random);
						   //appt.setTitle(newTitle);
						appt.setTitle(ValuesGenerator.getString(random));
					}
					if (methodName.equals("setDescription")){
						appt.setDescription(ValuesGenerator.getString(random));
					}

					if (methodName.equals("getValid")) {
						appt.getValid();
					}

				}

				/**
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 	*/
			}
	 
	 
		 //System.out.println("Done testing...");
	 //}


	
}
