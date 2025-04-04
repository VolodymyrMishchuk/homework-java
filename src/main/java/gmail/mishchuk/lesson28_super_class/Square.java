package gmail.mishchuk.lesson28_super_class;

import lombok.Getter;
import lombok.Setter;

public class Square extends Rectangle {

    @Getter
    @Setter
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
}


