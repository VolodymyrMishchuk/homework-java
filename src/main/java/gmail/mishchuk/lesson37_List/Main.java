package gmail.mishchuk.lesson37_List;

import java.util.*;

import static gmail.mishchuk.lesson37_List.NumberUtils.*;
import static gmail.mishchuk.lesson37_List.WordUtils.*;

public class Main {
    public static void main(String[] args) {

        List<Number> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        getSum(numbers);
        getMultiplyOddNumber(numbers);

        List<String> words = Arrays.asList("we", "are", "looking", "for", "for", "different", "words");

        getShortestWord(words);
        getTheUniqWords(words);
        getDuplicateWords(words);
        Map<String, Integer> entries = getEntriesOfWords(words);

        System.out.println("\nЯкщо взяти і додадати прям всі цифри з numbers, то вийде " + getSum(numbers)
                + "\n\nА якщо виконати ще трішки дивної логіки"
                + "\n(ну хз для чого, але таке завдання було),"
                + "\nто отримаємо: " + getMultiplyOddNumber(numbers));

        System.out.println("\nА якщо опрацювати words, то ми зможемо"
                + "\nЗнайти найкоротше слово: [" + getShortestWord(words) + "]"
                + "\nВідібрати унікальні слова: " + getTheUniqWords(words)
                + "\nВизначити які слова дублюються: " + getDuplicateWords(words)
                + "\nНавіть дізнаємося скільки разів яке слово вживається, доприкладу: ");
        for (Map.Entry<String, Integer> entry : entries.entrySet()) {
            System.out.println("[" + entry.getKey() + " --> " + entry.getValue() + "]");
        }
    }
}