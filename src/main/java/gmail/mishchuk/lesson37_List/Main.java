package gmail.mishchuk.lesson37_List;

import java.util.List;

import static gmail.mishchuk.lesson37_List.NumberUtils.*;

public class Main {
    public static void main(String[] args) {

        List<Number> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumGeneral = getSum(numbers);
        List<Integer> resultMultiplyOddNumber = multiplyOddNumber(numbers);

        System.out.println("Якщо взяти і додадати прям всі цифри, то вийде " + sumGeneral
                + "\n\nА якщо виконати ще трішки дивної логіки"
                + "\n(ну хз для чого, але таке завдання було)"
                + "\nто отримаємо: " + resultMultiplyOddNumber);
    }
}
