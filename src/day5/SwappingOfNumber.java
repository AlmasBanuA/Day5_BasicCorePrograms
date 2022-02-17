package day5;

import java.util.Scanner;

public class SwappingOfNumber {

	public static void main(String[] args) {

	int a, b, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("before swapping no are:"+a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping no are:"+a+" "+b);
        
	}
}

	


