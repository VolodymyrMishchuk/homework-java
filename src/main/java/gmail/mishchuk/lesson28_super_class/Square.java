package gmail.mishchuk.lesson28_super_class;

public class Square extends Rectangle {

    public Square(double side, FormFactor formFactor) {
        super(side, side, formFactor);
    }

    @Override
    public void displayInfo() {
        System.out.println(
                " Form: " + getFormFactor()
                + "\n Width: " + getSide()
                + "\n Area: " + calculateArea()
                + "\n Perimeter: " + calculatePerimeter()
        );
    }

    public double getSide() {
        return getSideA();
    }

    public void setSide(double side) {
        super.setSideA(side);
        super.setSideB(side);
    }
}