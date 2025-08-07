package core_interview;

import java.util.Scanner;
// Use switch-case to print day of week from number

// Input: 3 → Wednesday

public class weekdaysSwitichcase {

	public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      
      System.out.println("Enter a Number");
      int number=sc.nextInt();
      
     switch(number) {
     case 1:
    	 System.out.println("Its a Sunday");
    	 break;
    	 
     case 2:
    	 System.out.println("Its a Monday");
    	 break;
    	 
     case 3:
    	 System.out.println("Its a Tuesday");
    	 break;
    	 
     case 4:
    	 System.out.println("Its a Wednesday");
    	 break;
    	 
     case 5:
    	 System.out.println("Its a Thrusday");
    	 break;
    	 
     case 6:
    	 System.out.println("Its a Friday");
    	 break;
    	 
     case 7:
    	 System.out.println("Its a Saturday");
     break;
     
     default:
    	 System.out.println("Invalid Day!!!! ");
     
     }
	}
}
