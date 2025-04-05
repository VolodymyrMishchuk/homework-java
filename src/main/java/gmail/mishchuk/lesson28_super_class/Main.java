package gmail.mishchuk.lesson28_super_class;

import static gmail.mishchuk.lesson28_super_class.FormFactor.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0, CIRCLE);
        circle.setRadius(15.0);
        circle.displayInfo();
        circle.calculatePerimeter();
        circle.calculateArea();

        Rectangle rectangle = new Rectangle(10.0, 5.0, RECTANGLE);
        rectangle.setSideA(12.0);
        rectangle.setSideB(8.0);
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.displayInfo();

        Square square = new Square(4.0, SQUARE);
        square.setSide(7.0);
        square.calculatePerimeter();
        square.calculateArea();
        square.displayInfo();

    }
}