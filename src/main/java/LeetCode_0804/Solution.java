package LeetCode_0804;

/**
 * @Author: Q-WHai
 * @Date: Created in 11:10 2019/04/25
 */
public class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morses = new String[] {
                ".-",
                "-...",
                "-.-.",
                "-..",
                ".",
                "..-.",
                "--.",
                "....",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                "--.-",
                ".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--.."
        };

        String[] codes = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            char[] cs = words[i].toCharArray();
            String s = "";
            for (char c : cs) {
                s = String.format("%s%s", s, morses[c - 'a']);
            }
            codes[i] = s;
        }

        int[] flags = new int[codes.length];
        int count = 0;
        for (int i = 0; i < codes.length; i++) {
            boolean found = false;
            for (int j = 0; j < flags.length; j++) {
                if (1 == flags[j]) {
                    if (codes[i].equals(codes[j])) {
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                flags[i] = 1;
                count++;
            }
        }

        return count;
    }
}