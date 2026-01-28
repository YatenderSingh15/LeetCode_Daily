1class Solution {
2    public int maxProductDifference(int[] nums) {
3        Arrays.sort(nums);
4        int maxprod=nums[nums.length-1] * nums[nums.length-2];
5        int minprod=nums[0]*nums[1];
6        return maxprod-minprod;
7    }
8}