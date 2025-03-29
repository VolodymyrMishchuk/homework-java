package gmail.mishchuk.lesson28_super_class;

public class Shape {

    public double calculateAreaRectangles(double a, double b) {
        double area = a * b;
        String strSuccess = "The area of the figure is:";
        String strFailure = "The area was not determined";
        if ( area != 0) {
            System.out.println(strSuccess + area);
            return area;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public double calculatePerimeterRectangles(double a, double b) {
        double perimeter = (a * 2) + (b * 2);
        String strSuccess = "The perimeter of the figure is:";
        String strFailure = "The perimeter was not determined";
        if ( perimeter != 0) {
            System.out.println(strSuccess + perimeter);
            return perimeter;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public double calculateAreaCircles(double radius) {
        double area = Math.PI * radius * radius;
        String strSuccess = "The area of the circle is:";
        String strFailure = "The area was not determined";
        if ( area != 0) {
            System.out.println(strSuccess + area);
            return area;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public double calculateCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        String strSuccess = "The circumference is:";
        String strFailure = "The perimeter was not determined";
        if ( circumference != 0) {
            System.out.println(strSuccess + circumference);
            return circumference;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public void displayInfo() {
        System.out.println("I hope this is what you wanted to see?");
    }
}
