package gmail.mishchuk.recursion;

public class Main {
    public static void main(String[] args) {
        int fuelConsumption = 5; // витрата пального на 100 км
        int fuelInReserve = 100;   // початковий запас пального
        double result = sum(fuelInReserve, fuelConsumption);
        System.out.println("Максимальна відстань: " + result + " км");
    }

    public static double sum(double fuel, double consumption) {
        if (fuel < 0.0001) { // базовий випадок: якщо пального майже не залишилось
            return 0;
        }
        double distance = (fuel / consumption) * 100; // скільки км можна проїхати
        return distance + sum(fuel - distance, consumption); // рекурсія
    }
}