package com.hascode.tutorial;

/**
 * Created by Rynn on 4/17/2017.
 */
import java.text.DecimalFormat;
import java.util.*;

public class RandomNumber {

    public static void main(String[] args) {
        int i;
        int count = 100;
        int sum = 0;
        int oddCount = 0;
        int evenCount = 0;
        float oddRate;
        float average;
        int array[] = new int[101];
        Random n = new Random();

        // random integers in [0, 100]

        for (i = 0; i <= count; i++) {
            //Obtain a random number bounded in 100
            int generatedInt = n.nextInt(100);
            System.out.print(generatedInt);

            array[i] = generatedInt;
            //Determine if even or odd
            int evenOdd = generatedInt % 2;

            //If there is any remainder, its odd
            if (evenOdd < 0) {
                System.out.println(" - Odd");
                oddCount++;
            }
            else {
                System.out.println(" - Even");
                evenCount++;
            }

            //Calculate sum of generated number
            sum = sum + generatedInt;
        }

        //Calculate average of generated number
        average = averageCalc(sum, count);

        //Calculate the rate of odd numbers
        oddRate = oddRate(oddCount, count);

        //Display stats
        dataDisplay(sum, average, oddCount, evenCount, oddRate, array);

         }

    //Calculate average
    public static float averageCalc(int sum, int count){
        float average = sum / (float) count;

        return average;
    }

    //Calculate oddRate
    public static float oddRate(int oddCount, int count) {
        float oddRate = oddCount / (float) count;

        return oddRate;
    }

    //Display stats
    public static void dataDisplay(int sum, float average, int oddCount, int evenCount, float oddRate, int array[]){

        System.out.println("");

        System.out.println("The sum of generated number is: " + sum);

        System.out.println("The average of generated number is: " + average);

        System.out.println("There are " + oddCount + " odd numbers.");

        System.out.println("There are " + evenCount + " even numbers.");

        System.out.println("The chance of getting an odd number is " + (int) (oddRate * 100 )+"%.");

        System.out.println("The last number is " + array[100] );
    }

}

