package core_interview;

import java.util.Scanner;

//	create additon method and add 4 numbers(Non static method)
public class Add_Method_addnumber {

	
	public  int Additionmethod(int num1,int num2,int num3,int num4) {
		return  num1+num2+num3+num4;
		
		
	}
	
	
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number1");
		int num1=sc.nextInt();
		
		System.out.println("Enter Number2");
		int num2=sc.nextInt();
		
		System.out.println("Enter Number3");
		int num3=sc.nextInt();
		
		System.out.println("Enter Number4");
		int num4=sc.nextInt();
		
		
		Add_Method_addnumber obj= new Add_Method_addnumber();
		int sum=obj.Additionmethod(num1, num2, num3, num4);
		
		System.out.println("sum of 4 number is: "+sum);
		
	
  
	}
}
