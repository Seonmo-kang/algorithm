class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        bfs(result,new ArrayList<>(),nums,0);
        return result;
    }
    public void bfs(List<List<Integer>> result, List<Integer> tempArr , int[] nums, int start){
        if(nums.length==start){
            result.add(new ArrayList<>(tempArr));
            return ;
        }
        tempArr.add(nums[start]);
        bfs(result,tempArr,nums,start+1);
        tempArr.remove(tempArr.size()-1);
        bfs(result,tempArr,nums,start+1);
    }
}