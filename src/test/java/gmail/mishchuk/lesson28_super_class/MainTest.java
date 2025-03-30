package gmail.mishchuk.lesson28_super_class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

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

    @Test
    void shouldDoCalculateCircumference() {
        // given
        Circle circle = new Circle(5.0, FormFactor.CIRCLE);

        // when
        circle.setRadius(15.0);
        circle.calculateAreaCircles(circle.getRadius());

        // then
        assertEquals(706.8583470577034, circle.calculateAreaCircles(circle.getRadius()));
        System.out.println(
                "We are waiting for circumference to be set to "
                        + 706.8583470577034
                        + "\nand got circumference: "
                        + circle.calculateAreaCircles(circle.getRadius())
        );
    }

    @Test
    void shouldDoCalculateAreaCircles() {
        // given
        Circle circle = new Circle(5.0, FormFactor.CIRCLE);

        // when
        circle.setRadius(15.0);
        circle.calculateAreaCircles(circle.getRadius());

        // then
        assertEquals(706.8583470577034, circle.calculateAreaCircles(circle.getRadius()));
        System.out.println(
                "We are waiting for area of circle to be set to "
                        + 706.8583470577034
                        + "\nand got area of circle: "
                        + circle.calculateAreaCircles(circle.getRadius())
        );
    }

    @Test
    void shouldDoSetAndGetWidthRectangles() {
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
    void shouldDoSetAndGetHeightRectangles() {
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

    @Test
    void shouldDoCalculatePerimeterRectangles() {
        // given
        Rectangle rectangle = new Rectangle(5.0, 4.0, FormFactor.RECTANGLE);

        // when
        rectangle.setWidth(7.0);
        rectangle.setHeight(8.0);
        rectangle.calculatePerimeterRectangles(rectangle.getWidth(), rectangle.getHeight());

        // then
        assertEquals(30.0, rectangle.calculatePerimeterRectangles(rectangle.getWidth(), rectangle.getHeight()));
        System.out.println(
                "We are waiting for perimeter of rectangle to be set to "
                        + 30.0
                        + "\nand got perimeter of rectangle: "
                        + rectangle.calculatePerimeterRectangles(rectangle.getWidth(), rectangle.getHeight())
        );
    }

    @Test
    void shouldDoCalculateAreaRectangles() {
        // given
        Rectangle rectangle = new Rectangle(5.0, 4.0, FormFactor.RECTANGLE);

        // when
        rectangle.setWidth(7.0);
        rectangle.setHeight(8.0);
        rectangle.calculateAreaRectangles(rectangle.getWidth(), rectangle.getHeight());

        // then
        assertEquals(56.0, rectangle.calculateAreaRectangles(rectangle.getWidth(), rectangle.getHeight()));
        System.out.println(
                "We are waiting for area of rectangle to be set to "
                        + 56.0
                        + "\nand got area of rectangle: "
                        + rectangle.calculateAreaRectangles(rectangle.getWidth(), rectangle.getHeight())
        );
    }

    @Test
    void shouldDoSetAndGetWidthSquares() {
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

    @Test
    void shouldDoCalculatePerimeterSquares() {
        // given
        Square square = new Square(5.0, FormFactor.RECTANGLE);

        // when
        square.setWidth(7.0);
        square.calculatePerimeterSquares(square.getWidth());

        // then
        assertEquals(28.0, square.calculatePerimeterSquares(square.getWidth()));
        System.out.println(
                "We are waiting for perimeter of square to be set to "
                        + 28.0
                        + "\nand got perimeter of square: "
                        + square.calculatePerimeterSquares(square.getWidth())
        );
    }

    @Test
    void shouldDoCalculateAreaSquares() {
        // given
        Square rectangle = new Square(5.0, FormFactor.RECTANGLE);

        // when
        rectangle.setWidth(7.0);
        rectangle.calculateAreaSquares(rectangle.getWidth());

        // then
        assertEquals(49.0, rectangle.calculateAreaSquares(rectangle.getWidth()));
        System.out.println(
                "We are waiting for area of square to be set to "
                        + 49.0
                        + "\nand got area of square: "
                        + rectangle.calculateAreaSquares(rectangle.getWidth())
        );
    }
}