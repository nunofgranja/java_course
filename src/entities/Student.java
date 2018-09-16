package entities;

public class Student {

	public String name;
	public double firstSemester;
	public double secondSemester;
	public double thirdSemester;

	public double calculateFinalGrade() {

		return (this.firstSemester + this.secondSemester + this.thirdSemester);
	}

	public String isStudentApproved() {

		double gradePercent = (this.calculateFinalGrade() * 100.00) / 100.00;

		if (gradePercent >= 60.00) {

			return "PASS";
		}

		else {

			return "FAILED"
			+ "/n"
			+ "MISSING "
			+ String.format("%.2f", 60.00 - calculateFinalGrade())
			;
		}
		
	}
}