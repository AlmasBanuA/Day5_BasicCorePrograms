package day5;

import java.util.Scanner; //import scanner class

public class EvenOdd {

	public static void main(String[] args) {

		int num; //declaring num variable
		
		System.out.println("Enter an integer number:"); 
		
		Scanner sc = new Scanner(System.in); //create scanner class object
		
		num = sc.nextInt(); //taking the num value from the user input
		
		// using modulo operator to check the number is divisible by 2 or not 
		if (num % 2 == 0)
			
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
}


	


