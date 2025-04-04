package gmail.mishchuk.lesson28_super_class;

import static gmail.mishchuk.lesson28_super_class.FormFactor.*;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0, CIRCLE);
        circle.setRadius(15.0);
        circle.displayInfo();
        circle.calculateCircumference(circle.getRadius());
        circle.calculateAreaCircles(circle.getRadius());

        Rectangle rectangle = new Rectangle(10.0, 5.0, RECTANGLE);
        rectangle.setSideA(12.0);
        rectangle.setSideB(8.0);
        rectangle.calculatePerimeter(rectangle.getSideA(), rectangle.getSideB());
        rectangle.calculateArea(rectangle.getSideA(), rectangle.getSideB());
        rectangle.displayInfo();

        Shape square = new Square(4.0, SQUARE);
        square.setSideA(7.0);
        square.calculatePerimeter(square.getSideA());
        square.calculateArea(square.getSideA());
        square.displayInfo();

    }
}