import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1_len = m-1;
        int num2_len = n-1;
        int total = m+n-1;
        while(num1_len>=0 && num2_len>=0){
            nums1[total--] = ( nums1[num1_len]>nums2[num2_len] ) ?
                nums1[num1_len--] : nums2[num2_len--]; 
        }
        while(num2_len>=0){
            nums1[total--]=nums2[num2_len--];
        }
    }
}    
//         // if(nums1==null&&nums2==null){
//         //     return empty;
//         // }else 
//         if(nums2 == null){
//             System.out.println(nums1);

//         }else if(nums1 == null){
//             System.out.println(nums2);

//         }else{
//             int[] nums1_sub = Arrays.copyOfRange(nums1,0,m);
//             int[] nums2_sub = Arrays.copyOfRange(nums2,0,n);
//             // List<Integer> list = new ArrayList(Arrays.asList(nums1_sub));
//             // list.addAll(Arrays.asList(nums2_sub));
//             int[] newArr = new int[nums1_sub.length+nums2_sub.length];
//             for(int i=0; i<nums1_sub.length;i++){
//                 newArr[i]=nums1_sub[i];
//             }
//             for(int i=nums1_sub.length;i<nums1_sub.length+nums2_sub.length;i++){
//                 newArr[i]=nums2_sub[i-nums1_sub.length];
//             }
//             Arrays.sort(newArr);
//             String arr = Arrays.toString(newArr);
            
