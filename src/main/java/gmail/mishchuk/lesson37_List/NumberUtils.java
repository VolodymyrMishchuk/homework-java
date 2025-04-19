package gmail.mishchuk.lesson37_List;

import java.util.*;

public class NumberUtils {
    public static double getSum(List<Number> numbers) {
        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static List<Long> getMultiplyOddNumber(List<Number> numbers) {
        List<Long> result = new ArrayList<>();

        for (Number number : numbers) {
            long value = number.longValue();
            if (value % 2 != 0) {
                result.add(value * 2);
            }
        }
        return result;
    }
}
