package core_interview;

// . Write a Java program to calculate the result of the expression:
//int a = 10, b = 5, c = 2;
//int result = a * b / c + b - c;


public class Calculateresult {

	public static void main(String args[]) {
		int a=10, b=5, c=2;

	int	result = (a*b)/(c+b)-c;
	          //    (10*5 / 2+5 -2) = (50/7-2)= (7-2) = 5
	
	System.out.println("The result of the Expression is : "+result);
	}
}
