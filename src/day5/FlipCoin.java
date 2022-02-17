package day5;

import java.util.Scanner; 		//import scanner class     

public class FlipCoin {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);		//create scanner object
		
        System.out.println("Enter Number how many times you want to flip a coin");
		
        int n = sc.nextInt();
        int head =0,tail=0;
        
	//create forloop to check the condition
	 for(int i=0;i<n;i++){
		
            if(Math.random()<0.5) 		//random function 
            {
                head++;
            }
            else
            {
                tail++;
            }
        }
		
        int headper = (head*100)/n;		//percentage of heads by using formula
		
	 int tailper = (tail*100)/n;		//percentage of tails by using formula
		
        System.out.println("Head Percentage :"+headper+"%");
        System.out.println("Tail Percentage :"+tailper+"%");
		
        System.out.println(head);
        System.out.println(tail);
    }
}

	


