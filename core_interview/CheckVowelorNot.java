package core_interview;

import java.util.Scanner;
//Check if a character is a vowel or consonant
public class CheckVowelorNot {

	public static void main(String args[]) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Character");
		
		char vowel=sc.next().charAt(0);
		
		if(vowel=='a' || vowel =='e' || vowel=='i' || vowel=='o' || vowel=='u') {
			System.out.println("It's a Vowel !!! ");
		}
		else {
			System.out.println("It's a consonant");
		}
	}
}
