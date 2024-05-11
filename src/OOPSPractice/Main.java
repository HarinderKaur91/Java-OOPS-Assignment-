package OOPSPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		School school = new School("Springfield High School");

		System.out.println("Welcome to " + school.getName() + " Stream Allocation and Teacher Rating System!\n");

		// Adding teachers
		Teacher teacher1 = new Teacher("Manvir Singh", 35, "Male", 101, 8000, new ArrayList<>());
		Teacher teacher2 = new Teacher("Ketaki Pillay", 34, "Female", 102, 8500, new ArrayList<>());
		school.addTeacher(teacher1);
		school.addTeacher(teacher2);

		// Student information input
		Student student = null;
		int numOfStudents;
		System.out.print("Enter the number of students: ");
		numOfStudents = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println("\nEnter details for Student " + (i + 1));
			student = Student.getInputForStudentInfo(scanner);
			school.addStudent(student);
			// Stream Allocation Result
			System.out.println("\n-- Stream Allocation Result --");
			student.displayStudentInfo();
			System.out.println("Allocated Stream: " + student.determineStream());
			System.out.println(student.name + " can enroll in courses like " + student.determineStream() + ".\n");
		}

		System.out.println("List of Students:");
		for (Student s : school.getStudents()) {
			System.out.println(s.getName());
		}

		// Teacher rating
		System.out.print("Please enter the teacher's name you wish to rate: ");
		String teacherName = scanner.nextLine();
		System.out.print("Please enter your rating for " + teacherName + " (1-5): ");
		int rating = scanner.nextInt();
		Teacher teacherToRate = school.findTeacher(school, teacherName);
		if (teacherToRate != null) {
			student.rateTeacher(teacherToRate, rating);
			double avgRating = teacherToRate.calculateAverageRating();
			System.out.println("\n-- Updated Teacher Rating --");
			System.out.println("Teacher: " + teacherToRate.name);
			System.out.println("New Average Rating: " + avgRating);
		} else {
			System.out.println("Teacher not found!");
		}
	}

}
