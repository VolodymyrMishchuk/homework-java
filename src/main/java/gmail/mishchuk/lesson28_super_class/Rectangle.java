package gmail.mishchuk.lesson28_super_class;

public class Rectangle extends Shape {

    private FormFactor formFactor;

    public Rectangle(double width, double height, FormFactor formFactor) {
        super(width, height);
        this.formFactor = formFactor;
    }

    public Rectangle(double width) {
        super(width);
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public void displayInfo() {
        System.out.println(" Form: " + formFactor + "\n Width: " + getWidth() + "\n Height: " + getHeight());
    }
}
