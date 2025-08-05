package core_interview;

import java.util.Scanner;

//Check if a number is even or odd (without using % operator)
public class CheckOddEven {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num= sc.nextInt();
		
		if((num & 1) == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}
