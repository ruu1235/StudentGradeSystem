import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent(String name) {
        boolean found = false;

        for (Student s : students) {
            if (s.getName().equals(name)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("查無此學生");
        }
    }
}