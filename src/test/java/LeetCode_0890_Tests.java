import LeetCode_0890.Solution;
import org.junit.Test;

import java.util.List;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-09 16:57
 * Last Modify: 2019-07-09
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0890_Tests {

    @Test
    public void test1() {
        String[] words = new String[] { "abc","deq","mee","aqq","dkd","ccc" };
        String pattern = "abb";

        List<String> list = new Solution().findAndReplacePattern(words, pattern);
        System.out.println(list);
    }

    @Test
    public void test2() {
        String[] words = new String[] { "ccc" };
        String pattern = "abb";

        List<String> list = new Solution().findAndReplacePattern(words, pattern);
        System.out.println(list);
    }
}
