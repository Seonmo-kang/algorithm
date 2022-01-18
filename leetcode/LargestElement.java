package leetcode;

import java.util.Arrays;
import java.util.Collections;
// import java.util.Collections;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer[] arr3 = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        // int 타입일 때는 Integer 타입 배열로 변경해 주어야 한다.
        Arrays.sort(arr3, Collections.reverseOrder());
        return arr3[k-1];
    }
}
