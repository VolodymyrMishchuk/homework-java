package gmail.mishchuk.lesson18;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        String intro = "\t\t Ну що, зкреейтимо авто?" +
//                "\n Тобі потрібно буде лише ввести марку," +
//                "\n скільки маєш пального і який у тебе розхід." +
//                "\n А програма тобі вже скаже скільки ти зможеш проїхати" +
//                "\n і чи взагалі матимеш право їхати," +
//                "\n оскільки TÜV буде у тебе рандомний (xa-xa)";
//        System.out.println(intro);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\nСтворюємо авто");
//        System.out.print("Називається: ");
//        String brand = scanner.nextLine();
//        double fuelInReserve;
//        while (true) {
//            System.out.print("Зараз у баку: ");
//            if (scanner.hasNextInt()) {
//                fuelInReserve = scanner.nextDouble();
//                if (fuelInReserve > 0.0) {
//                    break;
//                } else {
//                    System.out.println("Пального має бути трішки більше як 0!");
//                }
//            }
//        }
//
//        System.out.print("Яка витрата пального на 100 кілометрів? -- ");
//        double fuelConsumption = scanner.nextDouble();
//        scanner.nextLine(); // очистка буфера
//        int drivingRange = (int) sum(fuelInReserve, fuelConsumption);
//        System.out.println("Ага, тоді авто зможе подолати: " + drivingRange + "км");
//        Car car = new Car(brand, fuelInReserve, fuelConsumption);
//        System.out.println(car.toStringCustom());
//        scanner.close();


        Car car = new Car("BMW", 30, 10, LocalDate.of(2023, 9, 1));

        System.out.println(car.toStringCustom());
        car.setTankFullness(10);
        System.out.println(car.toStringCustom());

        System.out.println(car.calculateDrivingRange());

        car.setNextTuev(LocalDate.of(2027, 9, 2));

        System.out.println(car.isAllowedToDrive());
        System.out.println(car.isAbleToDrive());
        car.setTankFullness(0.0);
        System.out.println(car.isAbleToDrive());

    }
}
