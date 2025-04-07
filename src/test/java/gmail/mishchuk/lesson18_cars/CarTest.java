package gmail.mishchuk.lesson18_cars;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldDoCalculateDrivingRange() {
        //given
        Car car = new Car("BMW", 30, 10, LocalDate.of(2023, 9, 1));

        //when
        car.calculateDrivingRange();

        //then
        assertEquals(300, car.calculateDrivingRange());
    }

    @Test
    void shouldReturnTrueWhenCarIsAllowedToDrive() {
        //given
        Car car = new Car("BMW", 30, 10, LocalDate.of(2023, 9, 1));

        //when
        car.setNextTuev(LocalDate.of(2026, 4, 2));

        //then
        assertTrue(car.isAllowedToDrive());
    }

    @Test
    void shouldReturnTrueWhenCarIsAbleToDrive() {
        //given
        Car car = new Car("BMW", 30, 10, LocalDate.of(2023, 9, 1));

        //when
        car.setTankFullness(5);

        //then
        assertTrue(car.isAbleToDrive());
    }
}