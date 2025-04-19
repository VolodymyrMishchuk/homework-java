package gmail.mishchuk.lesson37_List;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static gmail.mishchuk.lesson37_List.NumberUtils.getMultiplyOddNumber;
import static gmail.mishchuk.lesson37_List.NumberUtils.getSum;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void shouldDoReturnSumOfAllNumbers() {
        // given
        List<Number> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // when
        double sumOfAll = getSum(numbers);

        // then
        assertEquals(sumOfAll, 55);
    }

    @Test
    void shouldDoReturnProductOfAllOddMultiplyToTwo() {
        // given
        List<Number> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // when
        List<Long> productOfAllOdd = getMultiplyOddNumber(numbers);

        // then
        assertEquals(productOfAllOdd, List.of(2L, 6L, 10L, 14L, 18L));
    }
}