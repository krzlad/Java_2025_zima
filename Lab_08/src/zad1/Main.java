package zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Anna", 4.5, 2000));
        students.add(new Student("Bartek", 3.0, 1999));
        students.add(new Student("Celina", 5.0, 2001));
        students.add(new Student("Dawid", 4.2, 2000));
        students.add(new Student("Ewa", 3.8, 1998));

        System.out.println("--- Przed posortowaniem ---");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\n--- Po posortowaniu (malejąco wg średniej) ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
