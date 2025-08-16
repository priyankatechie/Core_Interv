package OOPs;
/* Encapsulation
 * Gym Membership System
•	Fields (private)
name, age, membershipType (Monthly, Quarterly, Yearly)
•	Validation: age between 15–60.
•	Methods:
o	displayMembershipDetails() — print details

 */
public class Gym {

	private String name;
	private int age;
	private String membershipType;
	
	
	public Gym(String name,int age,String membershipType) {
		this.name=name;
		
		if(age >=15 && age<=60) {
		this.age=age;
		System.out.println("Age matched u can proceed further!!!");
		}
		else {
			System.out.println("Invalid Age !!");
		}
		this.membershipType=membershipType;
	}
	
public void displayMembershipDetails() {
	
	System.out.println("GYM MEMBERSHIP ");
	System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("membershipType :"+membershipType);
}
	
public static void main(String args[]) {
	Gym g1= new Gym("Priyanka",20,"Montly");
	g1.displayMembershipDetails();
}
}
