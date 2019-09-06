import LeetCode_0893.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-09-06 11:27
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0893_Tests {

    @Test
    public void test1() {
        Assert.assertEquals(3, new Solution().numSpecialEquivGroups(new String[]{ "a","b","c","a","c","c" }));
    }

    @Test
    public void test2() {
        Assert.assertEquals(4, new Solution().numSpecialEquivGroups(new String[]{ "aa","bb","ab","ba" }));
    }

    @Test
    public void test3() {
        Assert.assertEquals(3, new Solution().numSpecialEquivGroups(new String[]{ "abc","acb","bac","bca","cab","cba" }));
    }

    @Test
    public void test4() {
        Assert.assertEquals(1, new Solution().numSpecialEquivGroups(new String[]{ "abcd","cdab","adcb","cbad" }));
    }

    @Test
    public void test5() {
        Assert.assertEquals(1, new Solution().numSpecialEquivGroups(new String[]{ "zknd","ndzk","ndzk","zknd","ndzk" }));
    }

    @Test
    public void test6() {
        Assert.assertEquals(3, new Solution().numSpecialEquivGroups(new String[]{ "abcd","cdab","cbad","xyzz","zzxy","zzyx" }));
    }

}
