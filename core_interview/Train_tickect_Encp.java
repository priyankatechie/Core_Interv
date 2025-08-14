package OOPs;


/*
 * Train Ticket Reservation
Create a TrainTicket class with:
private String passengerName
private int seatNumber
private boolean confirmed
Ensure seat number is between 1 and 100 only.

Provide methods to book, cancel, and check ticket details.
 */
public class Train_tickect_Encp {

	private String Name;
	private int seatNumber;
	private boolean confirmed;
	
	
	public Train_tickect_Encp(String Name,int seatNumber,boolean confirmed) {
		this.Name=Name;
		this.seatNumber=seatNumber;
		this.confirmed=confirmed;
	}
	
     // getter  and setter
	public String Name() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		
		this.seatNumber = seatNumber;
	}

	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}


	// method
	public void bookticket(String Name,int seatNumber ) {
		if(seatNumber>0 && seatNumber<=100) {
			this.Name=Name;
			this.seatNumber=seatNumber;
			this.confirmed=true;
			System.out.println("Ticket Booked Sucessfully");
		}
		else {
			System.out.println("Invalid Seat Number");
		}
	}
	
	public void cancelTicket() {
        confirmed = false;
        System.out.println("Ticket cancelled.");
    }
	
	public void displayTicketDetails() {
        System.out.println("Passenger: " + Name);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Confirmed: " + confirmed);
    }


	public static void main(String args[]) {
		Train_tickect_Encp ticket1=new Train_tickect_Encp("",0,true);
		
		ticket1.bookticket("Priyanka", 5);
		ticket1.displayTicketDetails();
		
		   ticket1.cancelTicket();
	        ticket1.displayTicketDetails();
	}
	
}
