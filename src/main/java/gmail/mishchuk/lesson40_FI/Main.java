package gmail.mishchuk.lesson40_FI;

import java.util.function.*;

import static gmail.mishchuk.lesson40_FI.LogicToFI.*;

public class Main {
    public static void main(String[] args) {

        int numberToCheck = 5;
        Predicate<Integer> primeNumber = number -> getPrimeNumber(number);
        boolean result = primeNumber.test(numberToCheck);
        System.out.println("Чи є число " + numberToCheck + " простим?"
                + "\nPredicate протестивши повідомляє: " + result);

        int maxNumber = 10;
        int generatedNumber = getGeneratedNumber(maxNumber);
        Consumer<Integer> randomNumber = number ->
                System.out.println("\nConsumer повертає число: " + number);
        randomNumber.accept(generatedNumber);

        Supplier<Integer> randomDay = () -> getRandomDayOfWeek();
        int numDayOfWeek = randomDay.get();
        var dayOfWeek = switch (numDayOfWeek) {
            case 1 -> "Понеділок";
            case 2 -> "Вівторок";
            case 3 -> "Середа";
            case 4 -> "Четвер";
            case 5 -> "П'ятниця";
            case 6 -> "Субота";
            case 7 -> "Неділя";
            default -> "хз, як так вийшло. Тре перезапускать";
        };
        System.out.println("\nSupplier рандомно виводить зараз такий день тижня: " + dayOfWeek);

        double numberToRound = 25.7;
        Function<Double, Long> roundedNumber = number -> getRoundedDoubleToLong(number);
        Long longNumber = roundedNumber.apply(numberToRound);
        System.out.println("\nМи заюзаєм Function для того, щоб округлити Double до Long."
                + "\nТобто, якщо " + numberToRound
                + " округлити по правилах математики, то отримаємо: "
                + longNumber);

        int numberToStart = 10;
        UnaryOperator<Integer> numberFibonacci = number -> getNumberFibonacci(number);
        int numberToPrint = numberFibonacci.apply(numberToStart);
        System.out.println("\nЗа допомогою UnaryOperator можемо вираховувати Число Фібоначчі."
                + "\nА саме: \n\tз: " + numberToStart + "\n\tотримуємо: " + numberToPrint);
    }
}
