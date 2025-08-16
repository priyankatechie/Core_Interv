package OOPs;

/* encapsulation
 * Vehicle Registration
•	Fields (private)
registrationNumber, ownerName, yearOfManufacture
•	Validation: yearOfManufacture between 1990 and current year.
•	Methods:
o	displayVehicleDetails() — print details.
________________________________________

 */
public class VechileReg {
private int registrationNumber;
private String OwnerName;
private int yearofManuf;


public VechileReg(int registrationNumber,String OwnerName,int yearofManuf) {
	this.registrationNumber=registrationNumber;
	this.OwnerName=OwnerName;
	
	if(yearofManuf >=1990 && yearofManuf<=2025) {
	this.yearofManuf=yearofManuf;
	System.out.println("Year of Manufacture is Matched u can proceed");
	}
	else {
		this.yearofManuf=yearofManuf;
		System.out.println("Year of Manufacture Does not Match !!!1");
	}
}


public void displayVehicleDetails() 
{
	System.out.println("Registration Number :"+registrationNumber);
	System.out.println("Owner Name :"+OwnerName);
	System.out.println("Year of Manufacture :"+yearofManuf);
}



	
	public static void main(String args[]) {
		
		VechileReg v1= new VechileReg(8984, "Priyanka", 1989);
		
		v1.displayVehicleDetails();
	}
}
