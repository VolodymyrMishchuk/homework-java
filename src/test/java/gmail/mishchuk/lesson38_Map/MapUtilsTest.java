package gmail.mishchuk.lesson38_Map;

import org.junit.jupiter.api.Test;
import java.util.*;

import static gmail.mishchuk.lesson38_Map.MapUtils.getUnitedMap;
import static org.junit.jupiter.api.Assertions.*;

class MapUtilsTest {

    @Test
    void couldDoReturnUnitedMapFromTwoMaps() {
        // given
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("candy's", 5);
        map1.put("muffins", 7);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("chocolates", 5);
        map2.put("muffins", 3);

        // when
        Map<String, Integer> unitedMap = getUnitedMap(map1, map2);

        // then
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("candy's", 5);
        testMap.put("muffins", 10);
        testMap.put("chocolates", 5);

        assertEquals(unitedMap, testMap);
    }
}