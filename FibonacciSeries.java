package core_interview;

//Print Fibonacci series up to N terms

//0 1 1 2 3 5 ...

public class FibonacciSeries {
	 public static void main(String[] args) {
	        int n = 10; // number of terms to print
	        int first = 0, second = 1;

	        System.out.print("Fibonacci Series up to " + n + " terms: ");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(first + " ");

	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }
}
