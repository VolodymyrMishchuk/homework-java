package gmail.mishchuk.lesson30_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void shouldDoThrowEmptyExceptionWhenTheStackIsEmpty() {
        // given
        Stack theStack = new Stack(6);

        // when & then
        assertThrows(EmptyStackException.class, () -> theStack.readTop());
    }

    @Test
    void shouldDoThrowFullExceptionWhenTheStackIsFull() {
        // given
        Stack theStack = new Stack(2);
        theStack.addElementToStack(543);
        theStack.addElementToStack(547);

        // when & then
        assertThrows(FullStackException.class, () -> theStack.addElementToStack(546));
    }
}