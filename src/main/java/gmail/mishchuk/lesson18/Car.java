package gmail.mishchuk.lesson18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
//import lombok.Data;
import static gmail.mishchuk.recursion.Main.sum;

//@Data

class Car {
    private String brand;
    private double tankFullness;
    private double fuelConsumption;
    boolean currentTuev;
    private double drivingRange;
    LocalDate today = LocalDate.now();
    LocalDate startDate = LocalDate.of(2000, 1, 1);
    LocalDate endDate = LocalDate.of(2025, 12, 31);
    LocalDate randomDate = generateRandomDate(startDate, endDate);

    public static LocalDate generateRandomDate(LocalDate startDate, LocalDate endDate) {
        Random random = new Random();
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long randomDays = random.nextLong(daysBetween);
        return startDate.plusDays(randomDays)
                //, String str = startDate.plusDays(randomDays)
                ;
    }

    /*      це таке рішення пропонує Chat-GPT, коли хотів повернути з функції два значення


            import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

    class DateResult {
        LocalDate date;
        String dateString;

        public DateResult(LocalDate date, String dateString) {
            this.date = date;
            this.dateString = dateString;
        }
    }

    public class Main {
        public static DateResult generateRandomDate(LocalDate startDate, LocalDate endDate) {
            Random random = new Random();
            long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
            long randomDays = random.nextLong(daysBetween);
            LocalDate randomDate = startDate.plusDays(randomDays);
            return new DateResult(randomDate, randomDate.toString());
        }

        public static void main(String[] args) {
            LocalDate startDate = LocalDate.of(2020, 1, 1);
            LocalDate endDate = LocalDate.of(2025, 1, 1);
            DateResult result = generateRandomDate(startDate, endDate);

            System.out.println("Random Date: " + result.date);
            System.out.println("Date as String: " + result.dateString);
        }
    }
    */

    public Car(
            String brand,
            double tankFullness,
            double fuelConsumption
    ) {
        this.brand = brand;
        this.tankFullness = tankFullness;
        this.fuelConsumption = fuelConsumption;
        this.currentTuev = randomDate.isBefore(today) || randomDate.isEqual(today);
        this.drivingRange = sum(this.tankFullness, this.fuelConsumption);
        System.out.println("\n\t Тепер підсумуємо: ");
    }

    public String toStringCustom() {
        return "Наш " + brand +
                " заправлений на " + tankFullness +
                "л, отже з середнім розходом " + fuelConsumption +
                "л на 100км ми змогли би проїхати " + drivingRange +
                "км. Доречі наш TÜV має статус: " + currentTuev;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getTankFullness() {
        return tankFullness;
    }

    public void setTankFullness(double tankFullness) {
        this.tankFullness = tankFullness;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public boolean isCurrentTuev() {
        return currentTuev;
    }

    public void setCurrentTuev(boolean currentTuev) {
        this.currentTuev = currentTuev;
    }

    public double getDrivingRange() {
        return drivingRange;
    }

    public void setDrivingRange(double drivingRange) {
        this.drivingRange = drivingRange;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getRandomDate() {
        return randomDate;
    }

    public void setRandomDate(LocalDate randomDate) {
        this.randomDate = randomDate;
    }
}

