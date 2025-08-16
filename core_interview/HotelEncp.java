package OOPs;

/*
 * . Hotel Room Management
•	Fields (private)
roomNumber, type (AC/Non-AC), pricePerNight
•	Validation: roomNumber > 0, price > 0.
•	Methods:
o	changePrice(double newPrice) — update with validation.
o	displayRoomDetails() — print details

 */
public class HotelEncp {
private int roomNumber;
private String Type;
private double pricePerNight;


public HotelEncp(int roomNumber,String Type,double pricePerNight) {
	if(roomNumber>0) {
	this.roomNumber=roomNumber;
	}
	else {
		System.out.println("Room Number is Invalid!!");
	this.roomNumber=1;
	}
	this.Type=Type;
	
	if(pricePerNight>0) {
	this.pricePerNight=pricePerNight;
	}else {
		System.out.println("Price is Not Valid!!!");
	this.pricePerNight=500;
	}
}


public void changePrice(double newPrice) {
	if(newPrice>0) {
	if(Type.equalsIgnoreCase("AC")) {
		pricePerNight=newPrice+400;
	}else {
		pricePerNight= newPrice;			
	}
	System.out.println("Price Updated Successfully");
}else {
	System.out.println("Invalid Price! Cannot update.");
}
}

public void displayRoomDetails() {
	System.out.println("Hotel Room Details : ");
	System.out.println("Room Number : "+roomNumber);
	System.out.println("Room Type : "+Type);
	System.out.println("pricePerNight : "+pricePerNight);
	
}

	public static void main(String args[]) {
		HotelEncp room1=new HotelEncp(9876,"AC",1200);
		room1.displayRoomDetails();
		room1.changePrice(1500);
		room1.displayRoomDetails();
	}
}
