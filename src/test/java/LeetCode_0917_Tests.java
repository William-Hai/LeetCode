import LeetCode_0917.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-09-06 17:17
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0917_Tests {

    @Test
    public void test1() {
        Assert.assertEquals("dc-ba", new Solution().reverseOnlyLetters("ab-cd"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("j-Ih-gfE-dCba", new Solution().reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Qedo1ct-eeLg=ntse-T!", new Solution().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
