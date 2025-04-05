package gmail.mishchuk.lesson28_super_class;

public class Circle extends Shape {

    private FormFactor formFactor;
    private double radius;

    public Circle(double radius, FormFactor formFactor) {
        this.radius = radius;
        this.formFactor = formFactor;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public void displayInfo() {
        System.out.println(" Form: " + formFactor
                        + "\n Radius: " + radius
                        + "\n Area: " + calculateArea()
                        + "\n Circumference: " + calculatePerimeter()
        );
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
