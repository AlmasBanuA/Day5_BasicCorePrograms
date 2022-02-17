package day5;

import java.util.Scanner;	//import scanner class

public class SwappingOfNumber {

	public static void main(String[] args) {

	int a, b, c;	//declaring variables
		
        Scanner sc=new Scanner(System.in); 	// create scanner object
		
        System.out.println("Enter the value of a and b:");
		
        a=sc.nextInt();		//taking values from input
        b=sc.nextInt();
		
        System.out.println("before swapping no are:"+a+" "+b);		//number before swap
	c=a;
        a=b;
        b=c;	
        System.out.println("After swapping no are:"+a+" "+b);		//after swap
        
	}
}

	


