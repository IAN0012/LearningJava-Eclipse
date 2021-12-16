package applicatiion;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Student stud = new Student();
		
		System.out.println("Enter your name: ");
		stud.name = sc.nextLine();
		
		System.out.println("Enter your grade 1");
		stud.grade1 = sc.nextDouble();
		stud.name = sc.nextLine();
		System.out.println("Enter your grade 2");
		stud.grade2 = sc.nextDouble();
		stud.name = sc.nextLine();
		System.out.println("Enter your grade 3");
		stud.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", stud.sumGrades());
		stud.passOrFailed(stud.grade1, stud.grade2, stud.grade3);
		
		sc.close();
	}

}
