package gmail.mishchuk.lesson28_super_class;



public class Square extends Rectangle {

    double sideA;
    private FormFactor formFactor;

    public Square(double sideA, FormFactor formFactor) {
        this.sideA = sideA;
        this.formFactor = formFactor;
    }

    @Override
    double calculateArea() {
        double area = sideA * sideA;
        if (area != 0) {
            return area;
        }
        return 0;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = sideA * 4;
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
                + "\n Area: " + calculateArea()
                + "\n Perimeter: " + calculatePerimeter()
        );
    }

    @Override
    public double getSideA() {
        return sideA;
    }

    @Override
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public FormFactor getFormFactor() {
        return formFactor;
    }

    @Override
    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }
}


