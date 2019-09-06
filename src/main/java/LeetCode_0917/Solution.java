package LeetCode_0917;

/**
 * String
 *
 * Create Time: 2019-09-06 17:15
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int a = 0, b = arr.length - 1;
        while (a < b) {
            if (isNotLetter(arr[a])) {
                a++;
                continue;
            }

            if (isNotLetter(arr[b])) {
                b--;
                continue;
            }

            swap(arr, a++, b--);
        }

        return new String(arr);
    }

    private void swap(char[] arr, int a, int b) {
        char tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    private boolean isNotLetter(char c) {
        return !(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'));
    }
}