package gmail.mishchuk.lesson28_super_class;

abstract class Shape {

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.println("I hope this is what you wanted to see?))");
    }
}
