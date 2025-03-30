package gmail.mishchuk.lesson28_super_class;

import static gmail.mishchuk.lesson28_super_class.FormFactor.*;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0, CIRCLE);
        circle.setRadius(15.0);
        circle.displayInfo();
        circle.calculateCircumference(circle.getRadius());
        circle.calculateAreaCircles(circle.getRadius());

        Shape rectangle = new Rectangle(10.0, 5.0, RECTANGLE);
        rectangle.setWidth(12.0);
        rectangle.setHeight(8.0);
        rectangle.displayInfo();
        rectangle.calculatePerimeterRectangles(rectangle.getWidth(), rectangle.getHeight());
        rectangle.calculateAreaRectangles(rectangle.getWidth(), rectangle.getHeight());

        Shape square = new Square(4.0, SQUARE);
        square.setWidth(7.0);
        square.displayInfo();
        square.calculatePerimeterSquares(square.getWidth());
        square.calculateAreaSquares(square.getWidth());
    }
}