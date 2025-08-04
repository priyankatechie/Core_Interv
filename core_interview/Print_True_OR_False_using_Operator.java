package core_interview;

import java.util.Scanner;
//	Write a code using scan function such that the user should return true when enter 2 digit number, and false if enter 1 digit number or 3 digit number. ( use-->&& operator)
//	2 digit-->9 greater => 100 less than

public class Print_True_OR_False_using_Operator {

public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter A Number");
	int number = sc.nextInt();
	
	boolean istwodigit=number>9 && number<99;
	System.out.println(istwodigit);
	sc.close();
	
	
	

		
	
		
	}


}
