package core_interview;

import java.util.Scanner;

//Grade calculator using marks and if-else
public class GradeCalculate {

	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Marks");
		int marks=sc.nextInt();
		
		   
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("A+ Grade");
        } else if (marks >= 75) {
            System.out.println("A Grade");
        } else if (marks >= 60) {
            System.out.println("B Grade");
        } else if (marks >= 45) {
            System.out.println("C Grade");
        } else if (marks >= 35) {
            System.out.println("D Grade");
        } else {
            System.out.println("FAIL !!");
        }

		
	}
}
