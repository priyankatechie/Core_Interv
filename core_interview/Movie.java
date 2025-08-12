package OOPs;

/*
 * Movie Ticket Booking
Create a Movie class with:

movieName, screenNumber, ticketPrice, seatsAvailable.

Method to bookTickets(int qty) (reduce available seats if possible).

Display movie details before and after booking.
 */
public class Movie {

	String movieName;
	int screenNumber;
	double ticketPrice;
	int seatAvailable;
	
	
	public Movie(String movieName,int screenNumber,double ticketPrice,int seatAvailable) {
		this.movieName=movieName;
		this.screenNumber=screenNumber;
		this.ticketPrice=ticketPrice;
		this.seatAvailable=seatAvailable;
	}
	
	void bookticket(int qty) {
		if( qty <=seatAvailable ) {
			 seatAvailable -= qty;
				System.out.println(qty + " Ticket of  " + movieName + " booked successfully!");
        } else {
            System.out.println(" stock is not  available.");
        }
		}
	
	void display() {
		System.out.println("Movie Name :"+movieName+ " Screen Number :"+screenNumber+ " Ticket Price: "+ticketPrice+ " seat Available :"+seatAvailable);
	}
	
	public static void main(String args[]) {
		
		Movie m1= new Movie("Saiyaara",3,240,5);
		Movie m2= new Movie("Gabbar 2",1,250,2);
		Movie m3= new Movie("Timepass 2",2,300,10);
		
		System.out.println("Before Booking the Seat ");
		m1.display();
		m2.display();
		m3.display();
		
		
		System.out.println("After Booking the Seat" );
		m1.bookticket(3);
		m2.bookticket(3);
		m3.bookticket(4);
	}
}
