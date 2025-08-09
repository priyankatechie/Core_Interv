package core_interview;

//Check if a number is prime.

public class funcisPrime {
	 public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false; // 0, 1 and negatives are not prime
	        }

	        // Check from 2 to num-1
	        for (int i = 2; i < num; i++) {
	            if (num % i == 0) { // found a divisor
	                return false;
	            }
	        }
	        return true; // no divisors found → prime
	    }

	    public static void main(String[] args) {
	        int number = 9; // you can change this number
	        if (isPrime(number)) {
	            System.out.println(number + " is a Prime Number");
	        } else {
	            System.out.println(number + " is NOT a Prime Number");
	        }
	    }
	}