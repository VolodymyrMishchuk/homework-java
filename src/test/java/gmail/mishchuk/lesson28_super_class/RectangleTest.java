package gmail.mishchuk.lesson28_super_class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldDoSetAndGetFormFactor() {
        // given
        Rectangle rectangle = new Rectangle(5.0, 4.0, FormFactor.RECTANGLE);

        // when
        rectangle.setFormFactor(FormFactor.SQUARE);

        // then
        assertEquals(FormFactor.SQUARE, rectangle.getFormFactor());
        System.out.println(
                "We are waiting for form factor to be set to "
                        + FormFactor.SQUARE
                        + "\nand got form factor: "
                        + rectangle.getFormFactor()
        );
    }

    @Test
    void shouldDoSetAndGetWidth() {
        // given
        Rectangle rectangle = new Rectangle(5.0, 4.0, FormFactor.RECTANGLE);

        // when
        rectangle.setWidth(7.0);

        // then
        assertEquals(7.0, rectangle.getWidth());
        System.out.println(
                "We are waiting for width to be set to "
                        + 7.0
                        + "\nand got width: "
                        + rectangle.getWidth()
        );
    }

    @Test
    void shouldDoSetAndGetHeight() {
        // given
        Rectangle rectangle = new Rectangle(5.0, 4.0, FormFactor.RECTANGLE);

        // when
        rectangle.setHeight(8.0);

        // then
        assertEquals(8.0, rectangle.getHeight());
        System.out.println(
                "We are waiting for width to be set to "
                        + 8.0
                        + "\nand got width: "
                        + rectangle.getHeight()
        );
    }
}