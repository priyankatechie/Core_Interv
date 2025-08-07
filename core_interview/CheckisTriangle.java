package core_interview;

import java.util.Scanner;

// Check if triangle is valid using 3 sides

// A triangle is valid if sum of any two sides > third


public class CheckisTriangle {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Side 1");
		
		int side1= sc.nextInt();
		
		System.out.println("Enter Side 2");
		int side2=sc.nextInt();
		
		System.out.println("Enter Side 3");
		int side3=sc.nextInt();
		
	
		
		if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2) {
			System.out.println("Triangle is Valid");
		}
		else {
			System.out.println("Triangle is Invalid");
		}
	}
}
