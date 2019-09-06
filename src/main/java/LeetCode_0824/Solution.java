package LeetCode_0824;

/**
 * String
 *
 * Create Time: 2019-09-06 16:10
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public String toGoatLatin(String S) {

        char[] map = new char[128];
        map['a'] = map['e'] = map['i'] = map['o'] = map['u'] = map['A'] = map['E'] = map['I'] = map['O'] = map['U'] = 1;

        String[] segs = S.split(" ");
        String[] tmp = new String[segs.length];
        for (int i = 0; i < segs.length; i++) {
            tmp[i] = String.format("%sma%s", 1 == map[segs[i].charAt(0)] ? segs[i] : convert(segs[i]), getSuffix(i + 1));
        }

        return String.join(" ", tmp);
    }

    private String getSuffix(int num) {
        String res = "";
        for (int i = 0; i < num; i++) {
            res = String.format("%sa", res);
        }

        return res;
    }

    private String convert(String s) {
        char[] res = new char[s.length()];
        for (int i = 1; i < s.length(); i++) {
            res[i - 1] = s.charAt(i);
        }
        res[s.length() - 1] = s.charAt(0);

        return new String(res);
    }
}
