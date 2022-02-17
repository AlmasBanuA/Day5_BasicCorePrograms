package day5;

import java.util.Scanner;	//import Scanner class

public class LeapYear {

	public static void main(String[] args) {

		int year;
		
		System.out.println("Enter Year");
		
		Scanner scan = new Scanner(System.in);		//create scanner object
		
		year = scan.nextInt();			//taking the year from user input

		
 		//To check if a year is a leap year, divide the year by 4 If it is fully divisible by 4, it is a leap year
		
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			
			System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");
	}
}
	


