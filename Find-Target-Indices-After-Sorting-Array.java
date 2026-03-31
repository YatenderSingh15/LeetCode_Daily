1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        List<Integer> list = new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] == target){
7                list.add(i);
8            }
9        }
10        return list;
11    }
12}