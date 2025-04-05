package gmail.mishchuk.lesson28_super_class;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;
    private FormFactor formFactor;

    public Rectangle(double sideA, double sideB, FormFactor formFactor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.formFactor = formFactor;
    }

    @Override
    public double calculateArea() {
        return (sideA * sideB);
    }

    @Override
    public double calculatePerimeter() {
        return ((sideA * 2) + (sideB * 2));
    }

    @Override
    public void displayInfo() {
        System.out.println(
                " Form: " + formFactor
                + "\n Width: " + sideA
                + "\n Height: " + sideB
                + "\n Area: " + calculateArea()
                + "\n Perimeter: " + calculatePerimeter()
        );
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
