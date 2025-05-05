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
        Set<Car> sortedTreeSetOfCar = new TreeSet<>(Comparator.comparing(Car::getYearOfManufacture));
        sortedTreeSetOfCar.addAll(treeSetOfCar);

        // then
        Set<Car> testTreeSetOfCar = new TreeSet<>();
        testTreeSetOfCar.add(new Car(2012, 2.0));
        testTreeSetOfCar.add(new Car(2018, 4.3));
        testTreeSetOfCar.add(new Car(2023, 2.3));

        // чому тут не має помилки?
        // що не так зробив?
        // адже: (treeSetOfCar, testTreeSetOfCar) завідомо є різними
        assertEquals(treeSetOfCar, testTreeSetOfCar);
        assertEquals(sortedTreeSetOfCar, testTreeSetOfCar);

        assertEquals(sortedTreeSetOfCar.size(), testTreeSetOfCar.size());
    }
}