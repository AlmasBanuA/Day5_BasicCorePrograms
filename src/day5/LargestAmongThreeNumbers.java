package day5;

import java.util.Scanner;		//import scanner class

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		int num1, num2, num3;		//declaring 3 variables in int data type
		
		System.out.println("Enter three integers: ");
		Scanner sc = new Scanner(System.in);		//create scanner object
		
		//taking 3 values from user input
		num1 = sc.nextInt();		
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		//finding largest among three numbers 
		if (num1 > num2 && num1 > num3)		
			System.out.println("The largest number is: " + num1);
		
		else if (num2 > num1 && num2 > num3)
			System.out.println("The largest number is: " + num2);
		
		else if (num3 > num1 && num3 > num2)
			System.out.println("The largest number is: " + num3);
		
		else
			System.out.println("The numbers are same");
	}
}

	


