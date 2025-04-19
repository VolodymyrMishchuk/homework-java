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
        return new LinkedHashSet<>(words);
    }

    public static Set<String> getDuplicateWords(List<String> words) {
        Set<String> seen = new LinkedHashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();

        for (String word : words) {
            if (!seen.add(word)) {
                duplicates.add(word);
            }
        }
        return duplicates;
    }

    public static Map<String, Integer> getEntriesOfWords(List<String> words) {
        Map<String, Integer> entriesCount = new HashMap<>();

        for (String word : words) {
            entriesCount.put(word, entriesCount.getOrDefault(word, 0) + 1);
        }
        return entriesCount;
    }
}
