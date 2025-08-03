package core_interview;

//Write a Java program to swap two numbers using a third variable.
public class Swaptwono {

	public static void main(String args[]) {
		
		int a=5;
		int b=6;
	
		System.out.println("Before Swapping !!");
		System.out.println("A is "+ a +  " \n B is : "+b);
		
		
		
		
		int temp =a;
		a=b;
		b=temp;		
		
		
		System.out.println("After Swapping !! ");
		System.out.println("A is " + a + " \n B is : "+b);
	}
	
}
