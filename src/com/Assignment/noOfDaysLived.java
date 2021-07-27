package com.Assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 1) Key in "1990-2-27"
 * 2) Use the SimpleDateFormat bridge object to input the string ---> Date
 * 3) getTime (): Get the system time millisecond value of your birth date
 * 4) Method to obtain the current system time millisecond value System millisecond value
 * 5) The result of two subtractions / 1000/60/60/24; days
 * */
public class noOfDaysLived {

    public static void main(String[] args) throws ParseException {

        // Create keyboard entry object
        Scanner sc = new Scanner(System.in) ;

        //receive
        System.out.println("Please enter your birthday date:");
        String s = sc.nextLine()	;// Date text format
        // The s ---> Date date format
        // Create SimpleDateFormat object
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
        // parse
        Date d = sdf.parse(s) ;
        // Get the oldTime time in milliseconds
        long oldTime = d.getTime() ;
        // Get the current system time in milliseconds
        long nowTime = System.currentTimeMillis() ;

        long time = nowTime - oldTime ;
        // Convert
        long day = time/1000/60/60/24;
        System.out.println("You came to this world"+day+"God");

    }
}