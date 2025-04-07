package gmail.mishchuk.lesson14_dragons;

import gmail.mishchuk.lesson14_dragons.quasiAnimals.Dragon;
import gmail.mishchuk.lesson14_dragons.quasiAnimals.TypeOfDragons;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String intro = "\n\t\t\t ВАЖЛИВА ІНФОРМАЦІЯ!" +
                "\n Наразі очікую від тебе певних послідовних дій," +
                "\n будь ласка, не підведи!" +
                "\n\n Зараз ми створюємо масив драконів, і саме ти вирішуєш наскільки великий" +
                "\n (без фанатизму, бо тобі ще заповнювати)))" +
                "\n\n Тому просто введи цифру від 1 до 10:";
        System.out.println(intro);

        Scanner scanner = new Scanner(System.in);
        int arrayLength;

        while (true) {
            if (scanner.hasNextInt()) {
                arrayLength = scanner.nextInt();
                if (arrayLength >= 1 && arrayLength <= 10) {
                    break;
                } else {
                    System.out.println("Введи число від 1 до 10!");
                }
            } else {
                System.out.println("Будь ласка, введи число!");
                scanner.next();
            }
        }

        Dragon[] dragons = new Dragon[arrayLength];

        System.out.println(
                "Тепер створимо наших дракончиків!" +
                "\n(після кожного введення потрібно натиснути Enter)"
        );

        scanner.nextLine(); // очистка буфера

        for (int i = 0; i < dragons.length; i++) {
            System.out.println("\nСтворюємо дракончика №" + (i + 1));

            System.out.print("Називається: ");
            String name = scanner.nextLine();

            int age;
            while (true) {
                System.out.print("Його вік: ");
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    if (age > 0) {
                        break;
                    } else {
                        System.out.println("Вік повинен бути більше 0!");
                    }
                } else {
                    System.out.println("Будь ласка, введи число!");
                    scanner.next();
                }
            }

            double weight;
            while (true) {
                System.out.print("Важить: ");
                if (scanner.hasNextDouble()) {
                    weight = scanner.nextDouble();
                    if (weight > 0) {
                        break;
                    } else {
                        System.out.println("Вага повинна бути більше 0!");
                    }
                } else {
                    System.out.println("Будь ласка, введи число!");
                    scanner.next();
                }
            }

            System.out.print("Type of dragon: ");
            String typeOfDragonsString = scanner.next();
            TypeOfDragons typeOfDragons = TypeOfDragons.valueOf(typeOfDragonsString);

            scanner.nextLine(); // очистка буфера
            dragons[i] = new Dragon(name, age, weight, typeOfDragons);
        }

        boolean executeLoop = true;

        while (executeLoop) {
            System.out.println("""
                    
                    Обери дію:\s
                     1 - Дракони вітаються;
                     2 - Дракони називаються;
                     3 - Дракони пускають вогонь;
                     4 - Чемно попрощатися і завершити програму.""");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // очистка буфера

                switch (choice) {
                    case 1 -> greetDragons(dragons);
                    case 2 -> nameDragons(dragons);
                    case 3 -> breatheFire(dragons);
                    case 4 -> {
                        System.out.println("Дракони кажуть: 'До побачення, друже! 🐉'");
                        executeLoop = false;
                    }
                    default -> System.out.println("Введи число від 1 до 4!");
                }
            } else {
                System.out.println("Будь ласка, введи число!");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static void greetDragons(Dragon[] dragons) {
        System.out.println("\nДракони вітають тебе!");
        for (Dragon dragon : dragons) {
            System.out.println(dragon.getName() + " каже: 'Привіт, людино! 🐲'");
        }
    }

    public static void nameDragons(Dragon[] dragons) {
        System.out.println("\nНаші дракони:");
        for (Dragon dragon : dragons) {
            System.out.println("- " + dragon.getName());
        }
    }

    public static void breatheFire(Dragon[] dragons) {
        Random random = new Random();
        System.out.println("\nОбережно, вогник-вогник!");
        for (Dragon dragon : dragons) {
            int fireAmount = random.nextInt(5) + 1;
            System.out.print(dragon.getName() + " дихнув: ");
            System.out.println("🔥".repeat(fireAmount));
        }
    }
}