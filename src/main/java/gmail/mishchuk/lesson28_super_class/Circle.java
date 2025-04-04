package gmail.mishchuk.lesson28_super_class;

public class Circle extends Shape {

    private FormFactor formFactor;
    double radius;

    public Circle(double radius, FormFactor formFactor) {
        this.radius = radius;
        this.formFactor = formFactor;
    }

    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        if (area != 0) {
            return area;
        }
            return 0;
    }

    @Override
    double calculatePerimeter() {
        double circumference = 2 * Math.PI * radius;
        if (circumference != 0) {
            return circumference;
        }
            return 0;
    }

    @Override
    public void displayInfo() {
        System.out.println(
                        " Form: " + formFactor
                        + "\n Radius: " + radius
                        + "\n Area: " + calculateArea()
                        + "\n Perimeter: " + calculatePerimeter()
        );
    }
}
