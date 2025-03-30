package gmail.mishchuk.lesson28_super_class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldDoSetAndGetFormFactor() {
        // given
        Circle circle = new Circle(5.0, FormFactor.CIRCLE);

        // when
        circle.setFormFactor(FormFactor.SQUARE);

        // then
        assertEquals(FormFactor.SQUARE, circle.getFormFactor());
        System.out.println(
                "We are waiting for form factor to be set to "
                + FormFactor.SQUARE
                + "\nand got form factor: "
                + circle.getFormFactor()
        );
    }

    @Test
    void shouldDoSetAndGetRadius() {
        // given
        Circle circle = new Circle(5.0, FormFactor.CIRCLE);

        // when
        circle.setRadius(7.0);

        // then
        assertEquals(7.0, circle.getRadius());
        System.out.println(
                "We are waiting for radius to be set to "
                        + 7.0
                        + "\nand got radius: "
                        + circle.getRadius()
        );
    }
}