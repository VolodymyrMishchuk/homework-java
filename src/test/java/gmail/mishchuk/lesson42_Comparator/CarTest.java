package gmail.mishchuk.lesson42_Comparator;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void shouldReturnComparedTreeSet() {
        // given
        Set<Car> treeSetOfCar = new TreeSet<>();
        treeSetOfCar.add(new Car(2023, 2.3));
        treeSetOfCar.add(new Car(2012, 2.0));
        treeSetOfCar.add(new Car(2018, 4.3));

        // when
        Set<Car> sortedListOfCar = new TreeSet<>(Comparator.comparing(Car::getYearOfManufacture));
        sortedListOfCar.addAll(treeSetOfCar);

        // then
        Set<Car> testSetOfCar = new TreeSet<>();
        testSetOfCar.add(new Car(2012, 2.0));
        testSetOfCar.add(new Car(2018, 4.3));
        testSetOfCar.add(new Car(2023, 2.3));

        // чому тут не має помилки?
        // що не так зробив?
        // адже: (treeSetOfCar, testSetOfCar) завідомо є різними
        assertEquals(treeSetOfCar, testSetOfCar);
        assertEquals(sortedListOfCar, testSetOfCar);

        assertEquals(sortedListOfCar.size(), testSetOfCar.size());
    }
}