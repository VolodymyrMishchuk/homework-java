package gmail.mishchuk.lesson40_FI;

import org.junit.jupiter.api.Test;

import java.util.function.*;

import static gmail.mishchuk.lesson40_FI.LogicToFI.*;
import static org.junit.jupiter.api.Assertions.*;

class LogicToFITest {

    @Test
    void couldDoReturnTrueIfANumberIsPrimeNumber() {
        // given
        int numberToCheck = 5;

        // when
        Predicate<Integer> primeNumber = number -> getPrimeNumber(number);
        boolean result = primeNumber.test(numberToCheck);

        // then
        assertTrue(result);
    }

    @Test
    void couldDoReturnFalseIfANumberIsNotPrimeNumber() {
        // given
        int numberToCheck = 6;

        // when
        Predicate<Integer> primeNumber = number -> getPrimeNumber(number);
        boolean result = primeNumber.test(numberToCheck);

        // then
        assertFalse(result);
    }

    @Test
    void couldDoRoundedDoubleNumberToLongNumber() {
        // given
        double numberToRound = 223.7;

        // when
        Function<Double, Long> roundedNumber = number -> getRoundedDoubleToLong(number);
        Long longNumber = roundedNumber.apply(numberToRound);

        // then
        assertEquals(longNumber, 224);
    }

    @Test
    void couldDoGetNumberFibonacci() {
        // given
        int numberToStart = 10;

        // when
        UnaryOperator<Integer> numberFibonacci = number -> getNumberFibonacci(number);
        int numberToPrint = numberFibonacci.apply(numberToStart);

        // then
        assertEquals(numberToPrint, 55);
    }
}