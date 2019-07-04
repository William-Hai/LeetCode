import LeetCode_0155.MinStack;
import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-28 10:51
 * Last Modify: 2019-05-28
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0155_Tests {

    @Test
    public void test1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-2, minStack.getMin());
    }

    @Test
    public void test3() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        Assert.assertEquals(-3, minStack.top());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        minStack.pop();
        Assert.assertEquals(-2, minStack.top());
    }
}
