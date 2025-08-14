package OOPs;

/*
 * •	Fields (private)
mobileNumber, balance
•	Validation: mobile number must be exactly 10 digits.
•	Methods:
o	recharge(double amount) — increase balance if amount > 0.
o	deduct(double amount) — deduct if sufficient balance.
o	displayAccountDetails() — print details.

 */
public class MobileAccount {

	private long mobileNumber;
	private double balance;
	
	
	public MobileAccount(long mobileNumber,double balance) {
		this.mobileNumber=mobileNumber;
		this.balance=balance;
	}
	
	
	// getter and setter
	

	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
	
		this.mobileNumber = mobileNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void recharge(double amount) {
		 if (amount > 0) {
	            balance += amount;
	            System.out.println("Recharge successful!");
	        } else {
	            System.out.println("Amount must be greater than 0.");
	        }
	}
	
	public void deduct(double amount) {
		if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Amount deducted successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
	}
	
	public void displayAccountDetails()
	{
		  System.out.println("Mobile: " + mobileNumber);
	        System.out.println("Balance: ₹" + balance);
		
	}
	
	
	public static void main(String args[]) {
		
		MobileAccount acc= new MobileAccount(9765667881L,0);
		
		acc.recharge(399);
		acc.deduct(100);
		acc.displayAccountDetails();
	}
}
