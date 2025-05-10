package gmail.mishchuk.lesson42_Stream_API;

import static gmail.mishchuk.lesson42_Stream_API.Student.studentList;

import java.util.List;
import java.util.Optional;

public class LogicStreamAPI {
    public static List<Student> filteredListStudentsGradeLessThanFour = studentList
            .stream()
            .filter(n -> n.getGrade() < 4)
            .toList();

    public static Optional<Double> maxGrade = studentList
            .stream()
            .map(Student::getGrade)
            .max(Double::compareTo);

    public static List<Student> filteredListStudentsWithMaxGrade = studentList
            .stream()
            .filter(n -> Double.compare(n.getGrade(), maxGrade.orElse(0.0)) == 0)
            .toList();

    public static long amountOfStudentsOverTwentyYears = studentList
            .stream()
            .filter(n -> n.getAge() > 20)
            .count();

    public static List<String> filteredListNamesOfStudentsWithMiddleGrade = studentList
            .stream()
            .sorted((n1, n2) -> Double.compare(n2.getGrade(), n1.getGrade()))
            .map(Student::getName)
            .toList();

    public static boolean anyStudentWithMaxGrade = maxGrade.isPresent() &&
            studentList
            .stream()
            .anyMatch(n -> n.getGrade() == maxGrade.get());

    public static List<String> filteredListNamesOfStudentsWithGradeAboveFour = studentList
            .stream()
            .filter(n -> n.getGrade() > 4)
            .map(Student::getName)
            .toList();
}