package day5;

import java.util.Scanner;	//import scanner class

public class QuotientRemainder {

	public static void main(String[] args) {

		int num1, num2, quotient, remainder;	// declare num values ,quotient and remainder
		
		Scanner sc = new Scanner(System.in);	// create scanner object
		
		System.out.println("Enter the value of num1 and num2");
		
		num1 = sc.nextInt();		// taking num values from user
		num2 = sc.nextInt();
		
		remainder = num1 % num2;	// modulating two numbers to get remainder
		
		quotient = num1 / num2;		// division of two numbers 

		System.out.println("The quotient are:" + quotient);
		System.out.println("The remainder are:" + remainder);
	}
}

