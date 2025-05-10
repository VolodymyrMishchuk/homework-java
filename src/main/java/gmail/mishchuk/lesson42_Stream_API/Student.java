package gmail.mishchuk.lesson42_Stream_API;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Student {

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static List<Student> studentList = new ArrayList<>(
            List.of(
                    new Student("Nola", 23, 5.0),
                    new Student("Pavlo", 18, 3.2),
                    new Student("John", 21, 4.0),
                    new Student("Evelina", 19, 4.8),
                    new Student("Paraska", 20, 3.7),
                    new Student("Prokopiy", 24, 5.0)
            )
    );

    @Override
    public String toString() {
        return "student: "
                + "\n\tname: " + name
                + ", age: " + age
                + ", grade: " + grade + ";";
    }
}

