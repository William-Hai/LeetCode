package LeetCode_0004;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> set = new ArrayList<>();

        int i = 0, j = 0;
        while (true){
            if (i >= nums1.length || j >= nums2.length){
                break;
            }
            set.add(nums1[i] < nums2[j] ? nums1[i++] : nums2[j++]);
        }

        for (int k = i; k < nums1.length; k++) {
            set.add(nums1[k]);
        }

        for (int k = j; k < nums2.length; k++) {
            set.add(nums2[k]);
        }

        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }

        int mid = list.size() / 2;

        return (list.size() % 2 == 0) ? (list.get(mid) + list.get(mid - 1)) / 2.0 : list.get(mid);
    }

}