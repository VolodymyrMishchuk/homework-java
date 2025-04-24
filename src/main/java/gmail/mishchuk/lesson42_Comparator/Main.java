package gmail.mishchuk.lesson42_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> listOfCar = new ArrayList<>();

        Car car1 = new Car(2012, 2.5);
        Car car2 = new Car(2022, 2.3);
        Car car3 = new Car(2019, 4.3);

        listOfCar.add(car1);
        listOfCar.add(car2);
        listOfCar.add(car3);

        Collections.sort(listOfCar);

        System.out.println(car1.compareTo(car2));
        System.out.println(listOfCar);
    }
}
