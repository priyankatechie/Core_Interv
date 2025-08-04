package core_interview;

import java.util.Scanner;

public class Divisionmethod {

	
	public int divi(int num1,int num2,int num3,int num4) {
		return num1/num2/num3/num4;
		
	}
	public static void main(String args[])
{
		
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter Num 1");
   int num1=sc.nextInt();
   
   System.out.println("Enter Num 2");
   int num2=sc.nextInt();
   
   System.out.println("Enter Num 3");
   int num3=sc.nextInt();
   
   
   System.out.println("Enter Num 4");
   int num4=sc.nextInt();
   
   Divisionmethod obj= new  Divisionmethod();
   int result=obj.divi(num1, num2, num3, num4);
   
   System.out.println("The division of 4 Num is:" +result);
   }
}
