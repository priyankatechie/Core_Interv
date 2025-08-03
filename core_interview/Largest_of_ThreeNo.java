package core_interview;

//Write a Java program to find the largest of three numbers using if-else.
//Input: a = 10, b = 20, c = 15

public class Largest_of_ThreeNo {

	public static void main(String args[]) {
		
		int a=10;
		int b=20;
		int c=30;
		
		int largest;
		
		if(a >=b && a>=c) {
			largest=a;	
		}
		else if(b>=a && b>=c) {
			largest=b;
		}
		else  {
			largest=c;
		}
		
		System.out.println("The largest Among three number is "+largest);
	}
}
