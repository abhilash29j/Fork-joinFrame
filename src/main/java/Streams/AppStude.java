package Streams;

import java.util.ArrayList;
import java.util.List;

public class AppStude {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam" ,true));
        students.add(new Student("Kevin" ,false));
        students.add(new Student("joe" ,true));
        students.add(new Student("daniel" ,false));
        //we can print the student's names
        students.stream().map(Student::getName).forEach(System.out::println);
    }
}
