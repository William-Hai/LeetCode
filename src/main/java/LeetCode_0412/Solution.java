package LeetCode_0412;

import java.util.ArrayList;
import java.util.List;

/**
 * Create Time: 2019-08-20 15:53
 * Last Modify: 2019-08-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> output = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            output.add(String.format("%s%s%s", 0 == (i % 3) ? "Fizz" : "", 0 == (i % 5) ? "Buzz" : "", 0 != (i % 3) && 0 != (i % 5) ? i : ""));
        }

        return output;
    }
}
