package core_interview;

import java.util.Scanner;

//To check if a year is a leap year, the following rules are applied in sequence:
//If the year is divisible by 400,
//it is a leap year.
//If the year is divisible by 100 but not by 400,
//it is NOT a leap year. 

public class CheckLeapyearorNot {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Year");
		
      int year=sc.nextInt();
		
		if(year%400 == 0) {
			System.out.println("Its a Leap year");
		}
		else if(year%100==0) {
			System.out.println("It is not a Leap Yaer");
		}
		else if(year%4==0) {
			System.out.println("Its a leap year");
		}
		else {
			System.out.println("It is not a leap Year");
		}
		
	}
}
