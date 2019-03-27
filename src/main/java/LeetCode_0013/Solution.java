package LeetCode_0013;

class Solution {

    public int romanToInt(String s) {
        int[] valueArray = getValueArray();
        char[] chars = s.toCharArray();
        int lv = 0;
        int sum = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            int v = valueArray[chars[i] - 'A'];
            sum = sum + v * ((v >= lv) ? 1 : -1);
            lv = v;
        }

        return sum;
    }

    private int[] getValueArray() {
        int[] arr = new int[26];
        arr['I' - 'A'] = 1;
        arr['V' - 'A'] = 5;
        arr['X' - 'A'] = 10;
        arr['L' - 'A'] = 50;
        arr['C' - 'A'] = 100;
        arr['D' - 'A'] = 500;
        arr['M' - 'A'] = 1000;

        return arr;
    }
}