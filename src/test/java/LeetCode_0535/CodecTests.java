package LeetCode_0535;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-03 15:56
 * Last Modify: 2019-07-03
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class CodecTests {

    @Test
    public void test1() {
        String srcUrl = "https://leetcode.com/problems/design-tinyurl";
        Codec codec = new Codec();
        String tinyUrl  = codec.encode(srcUrl);
        Assert.assertEquals(srcUrl, codec.decode(tinyUrl));
    }
}
