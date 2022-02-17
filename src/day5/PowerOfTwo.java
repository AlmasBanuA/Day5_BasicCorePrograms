package day5;

import java.util.Scanner;		//import scanner class

public class PowerOfTwo {

	public static void main(String[] args) {

		int num;	//declaring num variable in int data type
		
		System.out.println("Enter the number:");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();		//taking num value from input
		
		if (num > 31)
		{
			System.out.println("overflow");
		} 
		
		else
		for (int i = 1; i <= num; i++) 
		{
			System.out.println("Power of 2^" + i + " is :" + (Math.pow(2, i)));	//using math.power method to print table of power of 2
		}
	}
}
	


