1class Solution {
2    public long minOperations(int[] nums) {
3        long minOp = 0;
4        for(int i = 0; i < nums.length-1; i++){
5            if(nums[i] > nums[i+1]){
6                minOp += nums[i] - nums[i+1];
7            }
8        }
9        return minOp;
10    }
11}