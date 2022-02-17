package day5;

import java.util.Scanner;	//import scanner class

public class PrimeFactors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		//create scanner object
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();		//taking n value from input
		
		System.out.println("Prime factors for the given numbers are :");
		
		for (int i = 2; i <= n; i++) 		//taking forloop to check condition prime num started with 2
		{
			
		       while (n % i == 0)		//while loop to check condition 
		       		{

					System.out.println(i + "");
					n = n / i;
				}
		}

	}
}
