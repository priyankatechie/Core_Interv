package core_interview;

import java.util.Scanner;

//Check if a number is palindrome

//Input: 121 → true

public class CheckisPalindrome {

	public static void main(String args[]) {
		
		   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        int input = sc.nextInt();
        
        int original = input; // Save original number for comparison
        int reverse = 0;
        
        while (input > 0) {
            int lastdigit = input % 10;
            reverse = reverse * 10 + lastdigit;
            input = input / 10;
        }
        
        if (original == reverse) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
	}
}
