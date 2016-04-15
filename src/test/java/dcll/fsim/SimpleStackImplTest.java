package dcll.fsim;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleStackImplTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertTrue(simpleStack.isEmpty());
        Item element1 = new Item("toto");
        simpleStack.push(element1);
        Assert.assertFalse(simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {

    }

    @Test
    public void testPeek() throws Exception {

    }

    @Test
    public void testPop() throws Exception {

    }
}