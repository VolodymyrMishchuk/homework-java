package gmail.mishchuk.lesson41_homework_extra;

import org.junit.jupiter.api.Test;
import java.util.*;
import static gmail.mishchuk.lesson41_homework_extra.Logic.*;
import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void shouldDoCheckIfTheMethodReturnsTrue() {
        // given
        List<Integer> vidro = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // when
        boolean checked = checkBoolean(vidro);

        //than
        assertTrue(checked);
    }

    @Test
    void shouldDoCheckIfTheMethodReturnsFalse() {
        // given
        List<Integer> vidro = List.of(1, 1, 3, 4, 5, 6, 7, 8, 9, 10);

        // when
        boolean checked = checkBoolean(vidro);

        //than
        assertFalse(checked);
    }

    @Test
    void shouldDoCheckIfTheMethodSwapsKeyAndValue() {
        // given
        Map<String, Integer> mapBefore = new HashMap<>();
        mapBefore.put("cat", 1);

        // when
        Map<Integer, String> mapAfter = changeFields(mapBefore);

        //than
        Map<Integer, String> mapTest = new HashMap<>();
        mapTest.put(1, "cat");

        assertEquals(mapAfter, mapTest);
    }
}