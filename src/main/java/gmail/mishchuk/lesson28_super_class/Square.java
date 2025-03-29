package gmail.mishchuk.lesson28_super_class;

public class Square extends Rectangle {

    private FormFactor formFactor;

    public Square(double width, FormFactor formFactor) {
        super(width);
        this.formFactor = formFactor;
    }

    @Override
    public FormFactor getFormFactor() {
        return formFactor;
    }

    @Override
    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public void displayInfo() {
        System.out.println(" Form: " + formFactor + "\n Side of the square: " + getWidth());

    }

    /*
    @Override
    public double calculateAreaRectangles(double width, double height) {
        if (height == width) {
            double perimeter = (height * 4);
            String strSuccess = " The perimeter of the square is: ";
            String strFailure = "The perimeter was not determined";
            if (perimeter != 0) {
                System.out.println(strSuccess + perimeter);
                return perimeter;
            } else {
                System.out.println(strFailure);
                return 0;
            }
        }
        System.out.println("It isn't a square");
        return 0;
    }
    */
}
