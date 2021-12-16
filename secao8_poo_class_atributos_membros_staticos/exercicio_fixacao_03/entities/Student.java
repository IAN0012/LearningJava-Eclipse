package entities;

public class Student {

	public double grade1, grade2, grade3;
	public String name;
	
	public double sumGrades() {
		return grade1 + grade2 + grade3;
	}
	
	public void passOrFailed(double grade1, double grade2, double grade3) {
		if ((grade1 + grade2 + grade3) < 60) {
			System.out.println("FAILED");
			double missing = 60 - sumGrades();
			String miss = String.valueOf(missing);
			System.out.printf("MISSING %s POINTS", miss);
		}
		else {
			 System.out.println("PASS");
		}
	}
	
	
	
}
