package gmail.mishchuk.lesson30_stack_with_Optional;

import java.util.Optional;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean addElementToStack(int element) {
        if (isFull()) {
            return false;
        }
        stackArray[++top] = element;
        return true;
    }

    public Optional<Integer> deleteElementFromStack() {
        if (isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(stackArray[top--]);
    }

    public Optional<Integer> readTop() {
        if (isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(stackArray[top]);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println(")_^o^_(");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

