package gmail.mishchuk.lesson40_FI;

import java.util.Random;

public class LogicToFI {

//    public static boolean getPrimeNumberElvisStyle (int num) {
//        if (num <= 1 ? false);
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0 ? false : true);
//            }
//        return true;
//    }

    public static boolean getPrimeNumber(int numberToCheck) {
        if (numberToCheck <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getGeneratedNumber(int maxNumber) {
        Random random = new Random();
        return random.nextInt(maxNumber + 1);
    }

    public static int getRandomDayOfWeek() {
        return (int) (Math.random() * 8);
    }

    public static long getRoundedDoubleToLong(double number) {
        return Math.round(number);
    }

    public static int getNumberFibonacci(int number) {
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= number; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
