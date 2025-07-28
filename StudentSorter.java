import java.util.*;

class StudentList {
    String name;
    int marks;

    public StudentList(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        List<StudentList> students = new ArrayList<>();
        students.add(new StudentList("Vinay", 85));
        students.add(new StudentList("Rakesh", 70));
        students.add(new StudentList("Sai", 95));

        students.sort(Comparator.comparingInt(s -> s.marks));

        for (StudentList s : students) {
            System.out.println(s);
        }
    }
}