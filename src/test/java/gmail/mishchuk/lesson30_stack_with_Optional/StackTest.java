package gmail.mishchuk.lesson30_stack_with_Optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void shouldDoDeleteElementFromStack() {
        // given
        Stack theStack = new Stack(5);
        theStack.addElementToStack(1);
        theStack.addElementToStack(2);

        // when
        Optional<Integer> deleteElement = theStack.deleteElementFromStack();

        // then
        assertTrue(deleteElement.isPresent());
        //assertEquals(1, deleteElement.get());
    }

    @Test
    void shouldReturnEmptyWhenDeletingFromEmptyStack() {
        // given
        Stack theStack = new Stack(3);

        // when
        Optional<Integer> deletedElement = theStack.deleteElementFromStack();

        // then
        assertTrue(deletedElement.isEmpty());
    }

    @Test
    void shouldDoReadTop() {
        // given
        Stack theStack = new Stack(5);
        theStack.addElementToStack(100);
        theStack.addElementToStack(200);

        // when
        Optional<Integer> topElement = theStack.readTop();

        // then
        assertTrue(topElement.isPresent());
        assertEquals(200, topElement.get());
    }

    @Test
    void shouldReturnEmptyWhenReadingTopFromEmptyStack() {
        // given
        Stack theStack = new Stack(3);

        // when
        Optional<Integer> topElement = theStack.readTop();

        // then
        assertTrue(topElement.isEmpty());
    }
}