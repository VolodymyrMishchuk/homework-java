package gmail.mishchuk.lesson18_cars;

import java.time.LocalDate;

import static gmail.mishchuk.recursion.Main.sum;


public class Car {

    private String brand;
    private double tankFullness;
    private double fuelConsumption;
    private LocalDate nextTuev;

    public Car(String brand, double tankFullness, double fuelConsumption, LocalDate nextTuev) {
        this.brand = brand;
        this.tankFullness = tankFullness;
        this.fuelConsumption = fuelConsumption;
        this.nextTuev = nextTuev;
    }

    public String toStringCustom() {
        System.out.println("\n\t Тепер підсумуємо: ");

        return "Наш " + brand + " заправлений на " + tankFullness + "л, отже з середнім розходом " + fuelConsumption + "л на 100км ми змогли би проїхати " + calculateDrivingRange() + "км. Доречі наш TÜV має статус: " + nextTuev;
    }

    public double calculateDrivingRange() {
        if (this.tankFullness < 0.0001) {
            return 0;
        }
        double distance = (this.tankFullness / this.fuelConsumption) * 100;
        return distance + sum(this.tankFullness - distance, this.fuelConsumption);
    }

    public boolean isAllowedToDrive() {
        return LocalDate.now().isBefore(this.nextTuev) || LocalDate.now().isEqual(this.nextTuev);
    }

    public boolean isAbleToDrive() {
        return tankFullness > 0.0001;
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

    public LocalDate getNextTuev() {
        return nextTuev;
    }

    public void setNextTuev(LocalDate nextTuev) {
        this.nextTuev = nextTuev;
    }
}


