package gmail.mishchuk.lesson30_stack;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void addElementToStack(int element) {
        stackArray[++top] = element;
    }

    public int deleteElementFromStack() {
        return stackArray[top--];
    }

    public int readTop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() throws EmptyStackException {
        return (top == -1);
    }

    public boolean isFull() throws FullStackException {
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

