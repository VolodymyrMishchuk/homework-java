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
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

