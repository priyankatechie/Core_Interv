package core_interview;

import java.util.Scanner;

public class Substraction_subnum {

	public static int substraction(int no1,int no2,int no3,int no4) {
		return no1-no2-no3-no4;
	}
	
	
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Num1");
		int no1=sc.nextInt();
		
		System.out.println("Enter Num2");
		int no2=sc.nextInt();
		
		System.out.println("Enter Num3");
		int no3=sc.nextInt();
		
		System.out.println("Enter Num4");
		int no4=sc.nextInt();
		
		int result=substraction(no1,no2,no3,no4);
		
		System.out.println("Substraction result:"+result);
		
		
	}
}
