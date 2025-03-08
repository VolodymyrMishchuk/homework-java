package gmail.mishchuk.lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String intro = "\n\t\t\t ВАЖЛИВА ІНФОРМАЦІЯ!" +
                "\n Наразі очікую від тебе певних послідовних дій," +
                "\n будь ласка, не підведи!" +
                "\n\n Зараз ми створюємо масив і саме ти вирішуєш наскільки великий" +
                "\n (без фанатизму, бо тобі його ще заповнювати)))" +
                "\n\n Тому просто введи цифру від 1 до 10:";
        System.out.println(intro);

        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int [] array = new int[arrayLength];

        System.out.println(
                "Тепер напиши циферки для цього масиву:" +
                "\n(після кожного введення потрібно натиснути Enter)"
        );

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Супер, вийшло непогано:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println();

        String condition = "Доречі, ми можемо опрацювати дані з цього масиву," +
                "\nдля цього достатньо ввести цифру, яка відповідає команді:" +
                "\n 1 - Порахувати суму елементів;" +
                "\n 2 - Знайти середнє арифметичне;" +
                "\n 3 - Знайти найбільший елемент;" +
                "\n 4 - Завершити програму";

        boolean executeLoop = true;

        while (executeLoop) {
            System.out.println(condition);
            int input = scanner.nextInt();

            var result = switch(input) {
                case 1 -> findSumAllElements(array);
                case 2 -> findArithmeticMeanOfAllElements(array);
                case 3 -> findTheLargestElement(array);
                case 4 -> {
                    executeLoop = false;
                    scanner.close();
                    yield "Па-Ка !!!";
                }
                default -> "Зберись! Просто цифру від 1 до 4";
            };
            System.out.println(result);
        }
    }

    public static int findSumAllElements (int [] array) {
        int sum = 0;
        for (int element : array) {
            sum = sum + element;
        }
        System.out.println("Ось сума всіх чисел: " + sum);
        return sum;
    }

    public static int findArithmeticMeanOfAllElements (int [] array) {
        int arithmeticMean = findSumAllElements(array) / array.length;
        System.out.println("Середнє арифметичне число становить: " + arithmeticMean);
        return arithmeticMean;
    }

    public static int findTheLargestElement (int [] array) {
        int largestElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
        }
        System.out.println("Наразі це найбільше число у масиві: " + largestElement);
        return largestElement;
    }
}
