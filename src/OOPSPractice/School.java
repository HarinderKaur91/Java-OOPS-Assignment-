package OOPSPractice;
import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	private List<Teacher> teachers;
	private List<Student> students;

	public School(String name) {
		this.name = name;
		this.teachers = new ArrayList<>();
		this.students = new ArrayList<>();
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public String getName() {
		return name;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public List<Student> getStudents() {
		return students;
	}

	public Teacher findTeacher(School school, String teacherName) {
		for (Teacher teacher : school.getTeachers()) {
			if (teacher.name.equals(teacherName)) {
				return teacher;
			}
		}
		return null;
	}

}
