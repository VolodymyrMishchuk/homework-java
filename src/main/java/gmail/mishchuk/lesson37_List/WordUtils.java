package gmail.mishchuk.lesson37_List;

import java.util.*;

public class WordUtils {
    public static String getShortestWord(List<String> words) {
        String shortest = words.get(0);

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }

    public static Set<String> getTheUniqWords(List<String> words) {
        return new HashSet<>(words);
    }

    public static Set<String> getDuplicateWords(List<String> words) {
        Set<String> seen = new HashSet<>();
        Set<String> duplikates = new HashSet<>();

        for (String word : words) {
            if (!seen.add(word)) {
                duplikates.add(word);
            }
        }
        return duplikates;
    }

    public static Map<String, Integer> getEntriesOfWords(List<String> words) {
        Map<String, Integer> entersCount = new HashMap<>();

        for (String word : words) {
            entersCount.put(word, entersCount.getOrDefault(word, 0) + 1);
        }
        return entersCount;
    }
}
