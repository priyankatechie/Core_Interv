package OOPs;

/* Encapsulation
 * Student Attendance Tracker
•	Fields (private)
name, totalClasses, attendedClasses
•	Validation: attendedClasses ≤ totalClasses.
•	Methods:
o	getAttendancePercentage() — calculate percentage.
o	displayAttendance() — print details.

 */

public class Attendance {

	private String name;
	private int attendedClass;
	private int totalClass;
	
	public Attendance(String name,int attendedClass,int totalClass) {
		this.name=name;
		this.attendedClass=attendedClass;
		this.totalClass=totalClass;
	}
	
	
	// Getter Setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttendedClass() {
		return attendedClass;
	}
	public void setAttendedClass(int attendedClass) {
		this.attendedClass = attendedClass;
	}
	public int getTotalClass() {
		return totalClass;
	}
	public void setTotalClass(int totalClass) {
		this.totalClass = totalClass;
	}
	
	public void validateClass(int attendedClass,int totalClass ){
		if(attendedClass <= totalClass) {
			this.attendedClass=attendedClass;
			this.totalClass=totalClass;
		}
	}
	
	public int getAttendancePercentage() {
	int	percentage =attendedClass*100/totalClass;
return percentage;
	
	}
	
	public void displayAttendance() {
		System.out.println("Display Attendance of :"+name);
		System.out.println("Attended Class :"+attendedClass);
		System.out.println("Total Class :"+totalClass);
		System.out.print("Percentage :");
        System.out.println(getAttendancePercentage());
	}


	public static void main(String args[]) {
		Attendance att = new Attendance("Priyanka",98,150);
	
		att.getAttendancePercentage();
		att.displayAttendance();
	}
}
