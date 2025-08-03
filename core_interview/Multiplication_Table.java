package core_interview;

// Write a Java program to print the multiplication table of a number using a for loop.
//Input: n = 5 

public class Multiplication_Table {

	public static void main(String args[]) {
		
		int n=5;
		System.out.println("The Multiplication Table of 5 ");
		for(int i=1;i<=10;i++) {
			
			System.out.println(n+ " X" +i+ " =" +(n*i));
		}
		
		
		
	}
}
