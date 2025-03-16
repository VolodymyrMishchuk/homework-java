package gmail.mishchuk.lesson18;

import lombok.Data;

import java.time.LocalDate;
import java.util.Scanner;

import static gmail.mishchuk.lesson18.Car.generateRandomDate;
import static gmail.mishchuk.lesson18.Car.range;

@Data

public class Main {
    public static void main(String[] args) {

        String intro = "\t\t Ну що, зкреейтимо авто?" +
                "\n Тобі потрібно буде лише ввести марку," +
                "\n скільки маєш пального і який у тебе розхід." +
                "\n А програма тобі вже скаже скільки ти зможеш проїхати" +
                "\n і чи взагалі матимеш право їхати," +
                "\n оскільки TÜV буде у тебе рандомний (xa-xa)";
        System.out.println(intro);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nСтворюємо авто");

        System.out.print("Називається: ");
        String brand = scanner.nextLine();

        double tankFullness;
        while (true) {
            System.out.print("Зараз у баку: ");
            if (scanner.hasNextInt()) {
                tankFullness = scanner.nextDouble();
                if (tankFullness > 0.0) {
                    break;
                } else {
                    System.out.println("Пального має бути трішки більше як 0!");
                }
            }
        }

        System.out.print("Яка витрата пального на 100 кілометрів? - ");
        double fuelConsumption = scanner.nextDouble();

        scanner.nextLine(); // очистка буфера


        int drivingRange = (int) range(tankFullness, fuelConsumption);
        System.out.println("Ага, тоді авто зможе подолати: " + drivingRange + "км");

        LocalDate today = LocalDate.now();
        LocalDate startDate = LocalDate.of(2000, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 12, 31);
        LocalDate randomDate = generateRandomDate(startDate, endDate);

        boolean currentTuev = randomDate.isBefore(today) || randomDate.isEqual(today);

        Car car = new Car(brand, tankFullness, fuelConsumption, randomDate, currentTuev, drivingRange);
        System.out.println(car.toStringCustom());

        scanner.close();
    }
}
