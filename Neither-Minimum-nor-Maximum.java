1class Solution {
2    public int findNonMinOrMax(int[] nums) {
3        int ans = 0;
4        Arrays.sort(nums);
5        int min = nums[0];
6        int max = nums[nums.length-1];
7        for(int i = 0; i < nums.length; i++){
8            if(nums[i] != min && nums[i] != max){
9                 return ans = nums[i];
10            }
11        }
12        return -1;
13    }
14}