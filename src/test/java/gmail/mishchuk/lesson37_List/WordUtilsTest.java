package gmail.mishchuk.lesson37_List;

import org.junit.jupiter.api.Test;

import java.util.*;
import static gmail.mishchuk.lesson37_List.WordUtils.*;
import static org.junit.jupiter.api.Assertions.*;

class WordUtilsTest {

    @Test
    void shouldDoReturnShortestWordFromList() {
        // given
        List<String> words = Arrays.asList("we", "are", "looking", "for", "for", "different", "words");

        // when
        String testStr = getShortestWord(words);

        // then
        assertEquals("we", testStr);
    }

    @Test
    void shouldDoReturnUniquesWordsFromList() {
        // given
        List<String> words = Arrays.asList("we", "are", "looking", "for", "for", "different", "words");

        // when
        Set<String> uniqWordsSet = getTheUniqWords(words);

        // then
        Set<String> testSet = new LinkedHashSet<>(Arrays.asList("we", "are", "looking", "for", "different", "words"));

        assertEquals(uniqWordsSet, testSet);
    }

    @Test
    void shouldDoReturnDuplicatesWordsFromList() {
        // given
        List<String> words = Arrays.asList("we", "are", "looking", "for", "for", "different", "words");

        // when
        Set<String> duplicatedWords = getDuplicateWords(words);

        // then
        Set<String> testSet = new LinkedHashSet<>(List.of("for"));

        assertEquals(duplicatedWords, testSet);
    }

    @Test
    void shouldDoReturnNumberOfEntriesOfWordsFromList() {
        // given
        List<String> words = Arrays.asList("we", "for", "for");

        // when
        Map<String, Integer> entriesMap = getEntriesOfWords(words);

        // then
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("we", 1);
        testMap.put("for", 2);

        assertEquals(entriesMap, testMap);
    }
}