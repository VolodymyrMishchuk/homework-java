package gmail.mishchuk.lesson30_stack_with_Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Stack theStack = new Stack(3);

        if (!theStack.isFull()) theStack.addElementToStack(90);
        if (!theStack.isFull()) theStack.addElementToStack(89);
        if (!theStack.isFull()) theStack.addElementToStack(69);
        if (!theStack.isFull()) theStack.addElementToStack(3324);

        System.out.print("Наш стек: ");
        theStack.printStack();

        Optional<Integer> topElement = theStack.readTop();
        if (topElement.isPresent()) {
            System.out.println("Верхній елемент: " + topElement.get());
        } else {
            System.out.println("От-такої, а стек то порожній!");
        }

        while (!theStack.isEmpty()) {
            Optional<Integer> deleted = theStack.deleteElementFromStack();
            deleted.ifPresent(
                    element -> System.out.println("Видалено: " + element)
            );
        }

        Optional<Integer> deletedFromEmptyStack = theStack.deleteElementFromStack();
        if (deletedFromEmptyStack.isEmpty()) {
            System.out.println("Немає чого видаляти, стек порожнісінький");
        }

        int counter = 8;
        while (theStack.addElementToStack(1)) {
            counter++;
            System.out.println("Додано " + counter + " елемент(ів)");
        }

        boolean addedToFullStack = theStack.addElementToStack(999);
        if (addedToFullStack) {
            System.out.println("Нічого не вийшло, адже стек вже фуль!");
        }
    }
}
