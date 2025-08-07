package core_interview;

import java.util.Scanner;

//Print even numbers from 1 to N
public class printeventoN {

	public static void main(String args[]) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter N number");
	int n= sc.nextInt();
	
	
	for(int i=1;i<=n;i++) {
		if(i%2 == 0) {
			System.out.print(" "+i);
		}
	}
	
	
	}
}
