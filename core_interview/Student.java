package OOPs;

/*
 * 5. Student Grade Calculator
Question:
Create a Student class with:

rollNo, name, marks[] (array of 3 subjects).
Write methods to:

Calculate total marks and average.

Display student details with grade (A/B/C based on average).
 */
public class Student {

	int rollNo;
	String name;
	int[] marks;
	
	
	public Student(int rollNo,String name,int[] marks) {
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	int totalmarks() {
		int sum=0;
		for(int mark:marks)
			sum+=mark;
		return sum;
	}
	
    double averageMarks() {
        return totalmarks() / (double) marks.length;
    }
    
    char grade() {
        double avg = averageMarks();
        if (avg >= 80) return 'A';
        else if (avg >= 60) return 'B';
        else return 'C';
    }

    void display() {
    	  System.out.println("Roll No: " + rollNo + ", Name: " + name +
                  ", Total: " + totalmarks() + ", Avg: " + averageMarks() +
                  ", Grade: " + grade());
    }
	
	
	
	
	public static void main(String args[]) {
		
	int[] marks1 = {85, 90, 88};
    Student s1 = new Student(1, "Rahul Kumar", marks1);

    int[] marks2 = {65, 70, 60};
    Student s2 = new Student(2, "Priya Sharma", marks2);

    s1.display();
    s2.display();
}
}