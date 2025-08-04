package core_interview;

import java.util.Scanner;

public class Multiplication_Method {

	public int multi(int num1, int num2, int num3, int num4) {
		return num1*num2*num3*num4;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		
		System.out.println("Enter num3");
		int num3=sc.nextInt();
		
		System.out.println("Enter num4");
		int num4=sc.nextInt();
		
		
		Multiplication_Method obj= new Multiplication_Method();
		
		int result=obj.multi(num1, num2, num3, num4);
		
		System.out.println("The Multiplication of 4 number is:"+result);
	}
	
}
