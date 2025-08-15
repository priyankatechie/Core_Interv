package OOPs;

/* Encapsulation
 * Banking Loan Application
•	Fields (private)
borrowerName, loanAmount, interestRate
•	Validation: loanAmount > 0, interestRate between 5% and 20%.
•	Methods:
o	calculateYearlyInterest() — loanAmount × interestRate ÷ 100.
o	displayLoanDetails() — print details.
 */
public class LoanApp {

	private String borrowName;
	private double loanAmount;
	private float interestRate;
	
	
	public LoanApp(String borrowName,double loanAmount,float interestRate) {
		this.borrowName=borrowName;
		

        if (loanAmount > 0) {
            this.loanAmount = loanAmount;
        } else {
            throw new IllegalArgumentException("Loan amount must be greater than 0.");
        }

        if (interestRate >= 5 && interestRate <= 20) {
            this.interestRate = interestRate;
        } else {
            throw new IllegalArgumentException("Interest rate must be between 5% and 20%.");
        }
		
	}
	
	public int calculateYearlyInterest(double loanAmount, float interestRate)
	{
	return (int) (loanAmount * interestRate / 100);
	}
	
	
	public void displayLoanDetails() {
		System.out.println("Banking Loan Application");
		System.out.println("The Borrow Name is : "+borrowName);
		System.out.println("Loan Amount is : "+loanAmount);
		System.out.println("Interest Rate : "+interestRate);
		System.out.print("CalculateYearlyInterest : ");
		System.out.println(calculateYearlyInterest(10000,10 ));
	}
	public static void main(String args[]) {
		
		LoanApp l=new LoanApp("Priyanka",10000,10);
	
		l.displayLoanDetails();
		
	}
}
