package gmail.mishchuk.lesson37_List;

import java.util.*;

public class NumberUtils {
    public static int getSum(List<Number> numbers) {
        int sum = 0;

        for (Number number : numbers) {
            sum += number.intValue();
        }
        return sum;
    }

    public static List<Integer> getMultiplyOddNumber(List<Number> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Number number : numbers) {
            int value = number.intValue();
            if (value % 2 != 0) {
                result.add(value * 2);
            }
        }
        return result;
    }
}
