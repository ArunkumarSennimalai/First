package com.arun;
import java.util.*;
public class DayFinder {

	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	     System.out.println("Enter date: ");
	     int date = input.nextInt();
	     System.out.println("Enter month : ");
	     int month = input.nextInt();
	     System.out.println("Enter year : ");
	     int year = input.nextInt();
	     int year_code[] = {6,4,2,0,6};
	     int month_code[] = {0,3,3,6,1,4,6,2,5,0,3,5};
	     
	     int sum = date + (year % 100);
    	     sum += (year % 100) / 4;
   	     sum += year_code[(year/100)-16];
    	     sum += month_code[month-1];
    	
             String day[] = {"sun","mon","tue","wed","thu","fri","sat"};
    	     int day_code =sum;
   	 while(day_code>6)
    	 {
    		 day_code = day_code % 7;
    	 }
    	
    
	     if( year%400 ==0 && year%4==0 )
	     {
                 
	    	if(day_code == 0)
                {
                System.out.println("Day is sat");
                }
                else{
          
	    	 System.out.println("your day is "+day[day_code-1]);
                } 
	     }
	     else
	     {
                System.out.println("Day is "+day[day_code]);	    	
	     }
}
}
class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
