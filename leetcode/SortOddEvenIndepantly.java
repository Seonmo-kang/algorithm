class Solution {
    public int[] sortEvenOdd(int[] nums) {
        for(int i=2;i<nums.length;i+=2){
            int temp = nums[i];
            int j=i-2;
            while( 0<=j &&nums[j]>temp){
                    nums[j+2]=nums[j];
                    j-=2;
                }
                nums[j+2]=temp;
        }
        for(int i=3;i<nums.length;i+=2){
            int temp = nums[i];
            int j=i-2;
            while( 0<=j && nums[j]<temp){
                nums[j+2]=nums[j];
                j-=2;
            }
            nums[j+2]=temp;
        }
        return nums;
    }
}