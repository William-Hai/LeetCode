import LeetCode_0824.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-09-06 16:15
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0824_Tests {

    @Test
    public void test1() {
        Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", new Solution().toGoatLatin("I speak Goat Latin"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", new Solution().toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
