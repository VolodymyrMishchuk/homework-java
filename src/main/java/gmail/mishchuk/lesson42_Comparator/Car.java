package gmail.mishchuk.lesson42_Comparator;

public class Car implements Comparable<Car> {
    private int yearOfManufacture;
    private double engineCapasity;

    public Car(int yearOfManufacture, double engineCapasity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapasity = engineCapasity;
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
        return "\nYear of manufacture is: " + getYearOfManufacture();
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
