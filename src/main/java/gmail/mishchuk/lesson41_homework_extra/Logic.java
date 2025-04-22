package gmail.mishchuk.lesson41_homework_extra;

import java.util.*;

public class Logic {
    public static boolean checkBoolean(List<Integer> vidro) {
        Set<Integer> testVidro = new HashSet<>(vidro);
        boolean result = false;
        if (testVidro.size() == vidro.size())
            result = true;
        return result;
    }

    public static Map<Integer, String> changeFields(Map<String, Integer> oldMap) {
        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : oldMap.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }
}
