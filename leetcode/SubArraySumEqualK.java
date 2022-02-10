class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hashmap =new HashMap<>();
        int sum =0;
        int result = 0;
        hashmap.put(0,1);
        for(int i =0; i<nums.length; i++){
            sum+=nums[i];
            if(hashmap.containsKey(sum-k)){
                result+=hashmap.get(sum-k);
            }
            hashmap.put(sum,hashmap.getOrDefault(sum,0)+1);
        }
        return result;
    }
}