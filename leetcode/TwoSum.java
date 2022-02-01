package leetcode;

import java.util.HashMap;
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
            for(int i=0; i<nums.length;i++){
                int diff = target-nums[i];
                if(hashmap.containsKey(diff)){
                    int arr[] ={hashmap.get(diff),i};
                    return arr;
                }
                    hashmap.put(nums[i],i);
            }
            return null;
        }
    }

