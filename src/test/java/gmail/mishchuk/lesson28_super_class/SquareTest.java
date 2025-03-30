package gmail.mishchuk.lesson28_super_class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldDoSetAndGetFormFactor() {
        // given
        Square square = new Square(5.0, FormFactor.SQUARE);

        // when
        square.setFormFactor(FormFactor.RECTANGLE);

        // then
        assertEquals(FormFactor.RECTANGLE, square.getFormFactor());
        System.out.println(
                "We are waiting for form factor to be set to "
                        + FormFactor.RECTANGLE
                        + "\nand got form factor: "
                        + square.getFormFactor()
        );
    }

    @Test
    void shouldDoSetAndGetWidth() {
        // given
        Square square = new Square(5.0, FormFactor.SQUARE);

        // when
        square.setWidth(7.0);

        // then
        assertEquals(7.0, square.getWidth());
        System.out.println(
                "We are waiting for width to be set to "
                        + 7.0
                        + "\nand got width: "
                        + square.getWidth()
        );
    }

}