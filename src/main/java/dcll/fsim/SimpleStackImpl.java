package dcll.fsim;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21506032 on 14/04/2016.
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> wrappedStack = new Stack<Object>();

    @Override
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrappedStack.size();
    }

    @Override
    public void push(Item item) {
        wrappedStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}
