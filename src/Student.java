import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int year;
    private List<Course> courseList;

    public Student(int id, String name, String lastname, int year) {
        super(id, name, lastname);
        this.year = year;
        courseList = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courseList.add(course);
    }

    public void getCourses() {
        for (var course : courseList) {
            System.out.println(course.getAcronym() + ": " + course.getName());
        }
    }

    public int getYear() {
        return this.year;
    }
}
