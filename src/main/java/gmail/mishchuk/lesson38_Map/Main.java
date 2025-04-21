package gmail.mishchuk.lesson38_Map;

import java.util.*;
import static gmail.mishchuk.lesson38_Map.MapUtils.getUnitedMap;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("candy's", 5);
        map1.put("muffins", 7);
        map1.put("cookies", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("chocolates", 5);
        map2.put("muffins", 3);
        map2.put("waffles", 4);

        Map<String, Integer> map3 = getUnitedMap(map1, map2);

        System.out.println("\nЯк результат, \nз: "
                + map1 + "\nта: " + map2
                + "\nми отримали: " + map3
        );
    }
}
