class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        int count=0;
        for(int i: nums1){
            for(int j: nums2){
                hashmap.put(i+j,hashmap.getOrDefault(i+j,0)+1);
            }
        }
        for(int k: nums3){
            for(int p: nums4){
                if(hashmap.containsKey(-(k+p))){
                    count+=hashmap.get(-(k+p));
                }
            }
        }
        return count;
    }
}