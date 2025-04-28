package gmail.mishchuk.lesson42_Comparator;

public class Car implements Comparable<Car> {
    private final int yearOfManufacture;
    private final double engineCapacity;

    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(
                getYearOfManufacture(),
                otherCar.getYearOfManufacture()
        );
    }

    @Override
    public String toString() {
        return "\nYear of manufacture is: " + getYearOfManufacture()
                + ", engine capacity is: " + getEngineCapacity();
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
}
