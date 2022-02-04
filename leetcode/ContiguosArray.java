import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        int num_len = nums.length;
        Map<Integer,Integer> hashmap = new HashMap<>();
        if(num_len==0||nums==null){
            return 0;
        }
        for(int i =0; i<num_len;i++){
            if(nums[i]==0){
                nums[i] = -1;
            }
        }
        
        int sum=0;
        int max=0;
        
        hashmap.put(0,-1);
        
        for(int j=0; j < num_len; j++){
            sum += nums[j];
            if(hashmap.containsKey(sum)){
                int last = hashmap.get(sum);
                max = Math.max(max,j-last);
            }
            else{
                hashmap.put(sum,j);
            }
        }
        return max;
    }
}