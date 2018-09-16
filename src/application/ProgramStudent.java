package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Student student = new Student();
		Scanner sc = new Scanner(System.in);

	
		student.name = sc.nextLine();
	
		student.firstSemester = sc.nextDouble();
		student.secondSemester = sc.nextDouble();
		student.thirdSemester = sc.nextDouble();
		
			
		System.out.println("Final Grade: " + (student.calculateFinalGrade()));
		System.out.println(student.isStudentApproved());


		sc.close();
	}

}