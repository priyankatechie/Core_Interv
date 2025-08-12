package OOPs;

/*
 * Exam Result Processing
Create a Result class with:

studentName, subjectMarks (array), passMarks.

Method to check pass/fail for each subject.

Method to display final result with percentage.
 */
public class Result {
String studentName;
int[] subjectMarks;
int passMark;


public Result(String studentName,int[] subjectMarks,int passMark) {
	this.studentName=studentName;
	this.subjectMarks=subjectMarks;
	this.passMark=passMark;
}

void checkPassFail() {
    System.out.println("Pass/Fail Status for " + studentName + ":");
    for (int i = 0; i < subjectMarks.length; i++) {
        String status = (subjectMarks[i] >= passMark) ? "Pass" : "Fail";
        System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i] + " → " + status);
    }
}
    
    double calculatePercentage() {
        int total = 0;
        for (int mark : subjectMarks) {
            total += mark;
        }
        return (total / (double) subjectMarks.length);
    }
    
    
    void displayFinalResult() {
        System.out.println("\nFinal Result of " + studentName + ":");
        checkPassFail();
        double percentage = calculatePercentage();
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Overall Status: " + (percentage >= passMark ? "Pass" : "Fail"));
    }
	
	public static void main(String args[]) {
		  int[] marks1 = {78, 85, 69, 90, 55};
	        Result student1 = new Result("Priya", marks1, 70);

	        student1.displayFinalResult();
	}
}
