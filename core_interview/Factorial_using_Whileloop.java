package core_interview;

//  Write a program to calculate the factorial of a number using a while loop.
//Input: n = 5



public class Factorial_using_Whileloop {

	public static void main(String args[]) {
		
		int n=5;
		int fact=1;
		int i=1;
		
		while(i<=n) {
			fact = fact*i;
			i++;
		}
		System.out.println("The Factorial of "+n + " is " +fact);
		
	}
}
