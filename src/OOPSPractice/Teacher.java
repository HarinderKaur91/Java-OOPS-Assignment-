package OOPSPractice;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
	private int employeeID;
    private double salary;
    private List<String> coursesTaught;
    private List<Integer> ratings;

    public Teacher(String name, int age, String gender, int employeeID, double salary, List<String> coursesTaught) {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.salary = salary;
        this.coursesTaught = coursesTaught;
        this.ratings = new ArrayList<>();
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public double calculateAverageRating() {
        if (ratings.isEmpty())
            return 0.0;
        double sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return sum / ratings.size();
    }

    @Override
    String describeRole() {
        return "Teacher";
    }
}
