package day5;

import java.util.Scanner;	//import scanner class

public class VowelConsonant {

	public static void main(String[] args) {

		char ch;	// create ch variable
		
		System.out.println("Enter a character:");
		
		Scanner sc = new Scanner(System.in);		//create scanner obeject
		ch = sc.next().charAt(0);

		
		// using ifelse statement to check alphabet is vowel or not
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') 
			
		{
			System.out.println("the given char is vowel");
		} else
			System.out.println("The given char is consonant");
	}
}
