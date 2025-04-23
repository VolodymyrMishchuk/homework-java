package gmail.mishchuk.lesson38_Map;

import java.util.*;

public class MapUtils {

    public static Map<String, Integer> getUnitedMap(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> finalMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (finalMap.containsKey(key)) {
                finalMap.put(key, finalMap.get(key) + value);
                System.out.println("\nНам прийшлось додати " + key + " (" + map1.get(key) + " + " + value + "),"
                        + "\nоскільки вони були в обидвох Maps"
                );
            } else {
                finalMap.put(key, value);
            }
        }
        return finalMap;
    }
}