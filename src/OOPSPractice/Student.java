package OOPSPractice;
import java.util.Scanner;

public class Student extends Person {
	private int studentID;
	private double percentage;

	public Student(String name, int age, String gender, int studentID, double percentage) {
		super(name, age, gender);
		this.studentID = studentID;
		this.percentage = percentage;
	}

	public String determineStream() {
		if (percentage >= 85)
			return "Non-medical (e.g., Physics, Mathematics)";
		else if (percentage >= 75 && percentage <= 84.99)
			return "Medical (e.g., Biology, Chemistry)";
		else if (percentage >= 65 && percentage <= 74.99)
			return "Commerce (e.g., Economics, Business Studies)";
		else
			return "Arts (e.g., History, Literature)";
	}

	public void rateTeacher(Teacher teacher, int rating) {
		teacher.addRating(rating);
	}

	@Override
	String describeRole() {
		return "Student";
	}
	public String getName() {
        return name;
    }

	public static Student getInputForStudentInfo(Scanner scanner) {
		System.out.print("Please enter the student's name: ");
		String studentName = scanner.nextLine();
		System.out.print("Please enter the student's age: ");
		int studentAge = scanner.nextInt();
		scanner.nextLine(); 
		System.out.print("Please enter the student's gender: ");
		String studentGender = scanner.nextLine();
		System.out.print("Please enter the student's academic percentage: ");
		double studentPercentage = scanner.nextDouble();
		scanner.nextLine(); 
		return new Student(studentName, studentAge, studentGender, 101, studentPercentage);
	}
	public void displayStudentInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender +
                ", Academic Percentage: " + percentage + "%");
	}
	
}
