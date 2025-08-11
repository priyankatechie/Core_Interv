package OOPs;
/*
 * 3. ATM Transaction
Question:
Create a BankAccount class with:

accountNumber, accountHolderName, balance.

Methods: deposit(amount), withdraw(amount), displayBalance().
Write a program to:

Create one account.

Deposit and withdraw money.

Display the updated balance after each operation.
 */
public class BankAccount {

	long AccountNumber;
	String AccountHolderName;
	int balance;
	
	public BankAccount(long AccountNumber,String AccountHolderName,int balance) {
		this.AccountNumber=AccountNumber;
		this.AccountHolderName=AccountHolderName;
		this.balance=balance;
	}
     public void deposit(double amount) {
    	 balance +=amount;
    	 System.out.println("Deposited Amount is :"+amount);
     }
     
     public void withdraw(double amount) {
    	 if(amount<=balance) {
    		 balance-=amount;
    		 System.out.println("Withdraw Amount is : "+amount);    	 
    		 }else {
    			 System.out.println("Insuffient Amount");
    		 }
    	 
     }
     
     void displayBalance() {
         System.out.println("Account: " + AccountNumber + ", Holder: " + AccountHolderName +
                            ", Balance: ₹" + balance);
     }
	
	
	
	public static void main(String args[]) {
		
		BankAccount acc=new BankAccount(00101L, "Priyanka Walunj",11000);
	
		acc.displayBalance();
		
		acc.deposit(1500);
		acc.displayBalance();
		
		acc.withdraw(12000);
		acc.displayBalance();
		
	acc.withdraw(800);
	acc.displayBalance();
	
	}
}
