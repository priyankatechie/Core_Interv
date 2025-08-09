package core_interview;

public class funcfactorialofanumber {

	public static void facto(int num ) {
		int fact=1;
		for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
		System.out.println("Factorial of " + num + " is: " + fact);
	}
	public static void main(String args[]) {
		int num =5;
		facto(num);
	}
}
