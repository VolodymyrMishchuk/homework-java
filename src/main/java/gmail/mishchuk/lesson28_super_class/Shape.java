package gmail.mishchuk.lesson28_super_class;

public class Shape {

    private double width;
    private double height;
    private double radius;

    public double calculateAreaRectangles(double width, double height) {
        double area = width * height;
        String strSuccess = " The area of the rectangle is: ";
        String strFailure = "The area was not determined";
        if (area != 0) {
            System.out.println(strSuccess + area);
            return area;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public double calculatePerimeterRectangles(double width, double height) {
        double perimeter = (width * 2) + (height * 2);
        String strSuccess = " The perimeter of the rectangle is: ";
        String strFailure = "The perimeter was not determined";
        if (perimeter != 0) {
            System.out.println(strSuccess + perimeter);
            return perimeter;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public double calculateAreaSquares(double width) {
        double area = width * width;
        String strSuccess = " The area of the square is: ";
        String strFailure = "The area was not determined";
        if (area != 0) {
            System.out.println(strSuccess + area);
            return area;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public double calculatePerimeterSquares(double width) {
        double perimeter = width * 4;
        String strSuccess = " The perimeter of the rectangle is: ";
        String strFailure = "The perimeter was not determined";
        if (perimeter != 0) {
            System.out.println(strSuccess + perimeter);
            return perimeter;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public double calculateAreaCircles(double radius) {
        double area = Math.PI * radius * radius;
        String strSuccess = " The area of the circle is: ";
        String strFailure = "The area was not determined";
        if (area != 0) {
            System.out.println(strSuccess + area);
            return area;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public double calculateCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        String strSuccess = " The circumference is: ";
        String strFailure = "The perimeter was not determined";
        if (circumference != 0) {
            System.out.println(strSuccess + circumference);
            return circumference;
        } else {
            System.out.println(strFailure);
            return 0;
        }
    }

    public void displayInfo() {
        System.out.println("I hope this is what you wanted to see?))");
    }

    public Shape(double radius) {
        System.out.println("\nIt isn't an abstract figure, this is: ");
    }
    public Shape(double width, double height) {
        System.out.println("\nIt isn't an abstract figure, this is: ");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
