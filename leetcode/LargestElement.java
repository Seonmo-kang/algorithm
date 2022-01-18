package leetcode;
/*
 *  find Kth Largest element in int array
 *  using PriorityQueue 
 */
import java.util.PriorityQueue;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        int result=0;
        for(int i=0;i<nums.length;i++){
            maxHeap.add(nums[i]);
        }
        
        for(int j=0;j<k;j++){
             result = maxHeap.poll();
        }
        return result;
    }
}
