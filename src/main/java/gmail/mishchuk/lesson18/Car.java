package gmail.mishchuk.lesson18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import lombok.Data;

@Data

public class Car {

    String brand;
    private double tankFullness;
    private double fuelConsumption;

    LocalDate today = LocalDate.now();
    LocalDate startDate = LocalDate.of(2000, 1, 1);
    LocalDate endDate = LocalDate.of(2025, 12, 31);
    LocalDate randomDate = generateRandomDate(startDate, endDate);

    public static LocalDate generateRandomDate(LocalDate startDate, LocalDate endDate) {
        Random random = new Random();

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long randomDays = random.nextLong(daysBetween);

        return startDate.plusDays(randomDays);
    }

    double drivingRange = range(tankFullness, fuelConsumption);

    public static double range(double tankFullness, double fuelConsumption) {
        return (tankFullness / fuelConsumption) * 100;
    }

    ;

    boolean currentTuev = randomDate.isBefore(today) || randomDate.isEqual(today);

    public Car(
            String brand,
            double tankFullness,
            double fuelConsumption,
            LocalDate randomDate,
            boolean currentTuev,
            double drivingRange
    ) {
        this.brand = brand;
        this.tankFullness = tankFullness;
        this.fuelConsumption = fuelConsumption;
        this.randomDate = randomDate;
        this.currentTuev = currentTuev;
        this.drivingRange = drivingRange;

        System.out.println("\n\t Тепер підсумуємо: ");
    }

    public String toStringCustom() {
        return  "Наш " + brand +
                " заправлений на " + tankFullness +
                "л, отже з середнім розходом " + fuelConsumption +
                "л на 100км ми змогли би проїхати " + drivingRange +
                "км. Доречі наш TÜV має статус: " + currentTuev;
    }
}
