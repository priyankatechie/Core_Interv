package OOPs;
/*
 * 10. E-Learning Course Enrollment
Create a Course class with:

courseId, courseName, durationInWeeks, fees, studentsEnrolled.

Method to enroll students.

Method to display course details
 */
public class Course {

	int courseId;
	String courseName;
	int durationInWeeks;
	int fees;
	int studentsEnrolled;
	
	public Course(int courseId,String courseName,int durationInWeeks,int fees,int studentsEnrolled) {
		this.courseId=courseId;
		this.courseName=courseName;
		this.durationInWeeks=durationInWeeks;
		this.fees=fees;
		this.studentsEnrolled=studentsEnrolled;
	}
	
	public void enrollStudent(int noofStudent) {
		if(noofStudent >0) {
			studentsEnrolled += noofStudent;
			System.out.println("Student Enrolled Successfully");
		}else {
			System.out.println("Inalid No of Student");
		}
	}
	
	public void displaydetails() {
		System.out.println("=== Course Detail ===");
		System.out.println("COURSE ID : "+courseId);
		System.out.println("COURSE NAME : "+courseName);
		System.out.println("Duration In WEEK : "+durationInWeeks);
		System.out.println("FEES : "+fees);
		System.out.println("Student Enrolled : "+studentsEnrolled);
		System.out.println();
	}
	
	public static void main(String args[]) {
		
		Course java=new Course(101,"Fullstack Java",9,25000,15);
		Course CyberSecurity=new Course(102,"Cyber Security",12,45000,60);

		java.displaydetails();
		CyberSecurity.displaydetails();
		
		
		
		java.enrollStudent(9);
		CyberSecurity.enrollStudent(6);
		}
	
	
}
