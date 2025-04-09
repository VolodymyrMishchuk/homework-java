package gmail.mishchuk.lesson30_stack;

public class Main {
    public static void main(String[] args) {
        Stack theStack = new Stack(6);

        if (!theStack.isFull()) theStack.addElementToStack(90);
        if (!theStack.isFull()) theStack.addElementToStack(89);
        if (!theStack.isFull()) theStack.addElementToStack(69);
        if (!theStack.isFull()) theStack.addElementToStack(3324);

        System.out.print("Наш стек: ");
        theStack.printStack();

        if (!theStack.isEmpty()) {
            System.out.println("Верхній елемент: " + theStack.readTop());
        } else {
            System.out.println("От-такої, а стек то порожній!");
        }

        while (true) {
            try {
                if (theStack.isEmpty()) break;
            } catch (EmptyStackException e) {
                throw new RuntimeException(e);
            }
        }

        while (true) {
            try {
                if (theStack.isFull()) {
                    theStack.deleteElementFromStack();
                } break;
            } catch (FullStackException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
