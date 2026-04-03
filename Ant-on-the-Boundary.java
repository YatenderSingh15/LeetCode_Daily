1class Solution {
2    public int returnToBoundaryCount(int[] nums) {
3        int NoOftimes = 0;
4        int sum = 0;
5        for(int i = 0; i < nums.length; i++){
6            sum += nums[i];
7            if(sum == 0){
8                NoOftimes++;
9            }
10        }
11        return NoOftimes;
12    }
13}