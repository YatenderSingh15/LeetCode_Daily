1class Solution {
2    public int absDifference(int[] nums, int k) {
3        int maxSum = 0;
4        int minSum = 0;
5        Arrays.sort(nums);
6        for(int i = 0; i < k; i++){
7            minSum += nums[i];
8            maxSum += nums[nums.length - 1 - i];
9        }
10        return Math.abs(maxSum - minSum);
11    }
12}