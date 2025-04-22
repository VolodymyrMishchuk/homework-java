package gmail.mishchuk.lesson41_homework_extra;

import java.util.*;
import static gmail.mishchuk.lesson41_homework_extra.Logic.*;

public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {
        List<Integer> vidro1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> vidro2 = List.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> vidro3 = List.of(1, 2, 3, 4, 5, 6, 7, 7, 9, 10);

        Map<String, Integer> mapForExample = new HashMap<>();
        mapForExample.put("cat", 1);
        mapForExample.put("dog", 2);
        mapForExample.put("lacoste", 3);

        System.out.println("\n!!! Якщо немає дублікатів, то отримаємо true !!!" +
                "\n\nну то гляньмо:"
                + "\n " + vidro1 + " --> " + checkBoolean(vidro1)
                + "\n " + vidro2 + " --> " + checkBoolean(vidro2)
                + "\n " + vidro3 + " --> " + checkBoolean(vidro3)
        );

        System.out.println("\n\nДавайте подивимось, що ми можемо робити із Maps,"
                + "\nта навіть поміняти місцями ключ - значення!"
                + "\n " + mapForExample
                + "\n " + changeFields(mapForExample));
    }
}
