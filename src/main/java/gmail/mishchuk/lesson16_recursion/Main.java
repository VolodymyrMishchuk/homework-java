package gmail.mishchuk.lesson16_recursion;

public class Main {
    public static void main(String[] args) {
        int fuelConsumption = 5;
        int fuelInReserve = 100;
        double result = sum(fuelInReserve, fuelConsumption);
        System.out.println("Максимальна відстань: " + result + " км");
    }

    public static double sum(double fuel, double consumption) {
        if (fuel < 0.0001) {
            return 0;
        }
        double distance = (fuel / consumption) * 100;
        return distance + sum(fuel - distance, consumption);
    }
}