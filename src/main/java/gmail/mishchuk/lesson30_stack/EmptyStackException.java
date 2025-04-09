package gmail.mishchuk.lesson30_stack;

public class EmptyStackException extends RuntimeException {
  public EmptyStackException() {
        super("Стек пустий, раптом що!");
    }
}
