package dcll.fsim;

import java.util.EmptyStackException;

/**
 * Created by 21506032 on 14/04/2016.
 */
public interface SimpleStack {

    public boolean isEmpty();
    public int getSize();
    public void push(Item item);
    public Item peek() throws EmptyStackException;
    public Item pop() throws EmptyStackException;
}

