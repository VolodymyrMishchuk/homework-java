package gmail.mishchuk.lesson28_super_class;

public class Rectangle extends Shape {

    private FormFactor formFactor;
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, FormFactor formFactor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.formFactor = formFactor;
    }

    public Rectangle() {
    }

    @Override
    public double calculateArea() {
        double area = sideA * sideB;
        if (area != 0) {
            return area;
        }
            return 0;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = (sideA * 2) + (sideB * 2);
        if (perimeter != 0) {
            return perimeter;
        }
            return 0;
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
