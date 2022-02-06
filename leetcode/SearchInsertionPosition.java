class Solution {
    public int searchInsert(int[] nums, int target) {
        int result =0;
        if(nums[0]>target){
            return 0;
        }else if(nums[nums.length-1]==target){
            return nums.length-1;
        }else if(nums[nums.length-1]<=target){
                    return nums.length;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==target){
                result=i;
                break;
            }else if( nums[i]<=target && nums[i+1]>target){
                result=i+1;
                break;
            }
        }
        return result;
        }
}
