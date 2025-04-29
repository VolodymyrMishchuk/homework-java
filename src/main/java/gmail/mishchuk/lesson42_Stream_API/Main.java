package gmail.mishchuk.lesson42_Stream_API;

import static gmail.mishchuk.lesson42_Stream_API.LogicStreamAPI.*;

public class Main {
    public static void main(String[] args) {

        if (!filteredListStudentsGradeLessThanFour.isEmpty()) {
            System.out.println("students with an average grade less than 4.0:");
            filteredListStudentsGradeLessThanFour.forEach(System.out::println);
        }

        if (!filteredListStudentsWithMaxGrade.isEmpty()) {
            System.out.println("\nthe best grade have students:");
            filteredListStudentsWithMaxGrade.forEach(System.out::println);
        }

        long amount = amountOfStudentsOverTwentyYears;
        System.out.println("\nit is amount of students over 20 years old: " + amount + ";");

        if (!filteredListNamesOfStudentsWithMiddleGrade.isEmpty()) {
            System.out.println("\nit is a sorted list of students: ");
            filteredListNamesOfStudentsWithMiddleGrade.forEach(System.out::println);
        }

        boolean isAnyStudent = anyStudentWithMaxGrade;
        System.out.println("\nany student is with top grade: " + isAnyStudent);

        if (!filteredListNamesOfStudentsWithGradeAboveFour.isEmpty()) {
            System.out.println("\nstudents with an average grade above 4.0:");
            filteredListNamesOfStudentsWithGradeAboveFour.forEach(System.out::println);
        }
    }
}
