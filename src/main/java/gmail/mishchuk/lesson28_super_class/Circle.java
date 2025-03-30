package gmail.mishchuk.lesson28_super_class;

public class Circle extends Shape {

    private FormFactor formFactor;

    public Circle(double radius, FormFactor formFactor) {
        super(radius);
        this.formFactor = formFactor;
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public void displayInfo() {
        System.out.println(" Form: " + formFactor + "\n Radius: " + getRadius());
    }
}
