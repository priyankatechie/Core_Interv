package core_interview;

import java.util.Scanner;

public class reverseNo {
//Reverse a number

//Input: 123 → 321
	

	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int rev=0;
		while(n!=0) {
			int lastdigit=n%10;
			rev=rev*10+lastdigit;
			
			n= n/10;
			
		}
		
		System.out.println("Reversed number is :"+rev);
	}
}
