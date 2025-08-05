package core_interview;

import java.util.Scanner;
//Check if a number is positive, negative or zero
public class CheckNoPositiveNeg {

	public static void main(String args[])
{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int number= sc.nextInt();
		
		
		if(number>0) {
			System.out.println("Positive Number");
		}
		else if(number<0){
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Number is Zero");
		}

}
}
