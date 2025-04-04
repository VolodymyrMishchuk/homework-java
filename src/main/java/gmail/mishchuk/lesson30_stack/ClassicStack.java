package gmail.mishchuk.lesson30_stack;

public class ClassicStack {

    public static void main(String[] args) {
        Stack theStack = new Stack(10);

        if (!theStack.isFull()) theStack.addElementToStack(89);
        if (!theStack.isFull()) theStack.addElementToStack(69);
        if (!theStack.isFull()) theStack.addElementToStack(45);
        if (!theStack.isFull()) theStack.addElementToStack(34);

        if (!theStack.isEmpty()) theStack.deleteElementFromStack();

        System.out.print("Наш стек: ");

        if (!theStack.isFull()) {
            theStack.readTop();
        } else {
            System.out.println("От-такої, а стек то порожній!");
        }

        while (!theStack.isEmpty()) {
            int value = theStack.deleteElementFromStack();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }
}
