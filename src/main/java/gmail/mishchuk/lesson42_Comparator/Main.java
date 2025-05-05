package gmail.mishchuk.lesson42_Comparator;

import org.apache.commons.math3.util.Precision;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<Car> listOfCar = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int year = 2000 + random.nextInt(26);
            double engine = 1.0 + random.nextDouble(5.0);
            Car car = new Car(
                    year,
                    Precision.round(engine, 1)
            );
            listOfCar.add(car);
        }

        // Розумію, що тут не прорахований варіант коли і рік, і об'єм будуть однакові.
        // Наразі ризик такого мінімальний, хоч і не рівний нулю
        Set<Car> sortedListOfCar = new TreeSet<>(Comparator
                .comparing(Car::getYearOfManufacture)
                .thenComparing(Car::getEngineCapacity)
        );
        sortedListOfCar.addAll(listOfCar);

        System.out.println("\tBefore sorting: " + listOfCar
                + "\n\n\tAre sorted: " + sortedListOfCar);
    }
}
