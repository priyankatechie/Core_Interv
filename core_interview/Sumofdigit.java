package core_interview;

import java.util.Scanner;

//Sum of digits of a number

//Input: 123 → 1+2+3 = 6

public class Sumofdigit {

	public static int getsum(int n) {
	int sum =0;
		while(n!=0) {
	
			sum=sum+n%10;

	n=n/10;
		}
	return sum;
	}

		public static void main(String args[]) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter N");
			int n=sc.nextInt();
			
			System.out.println(getsum(n));
}
}