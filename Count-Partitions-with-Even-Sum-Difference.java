1class Solution {
2    public int countPartitions(int[] nums) {
3        int total = 0;
4        for(int num : nums) total+=num;
5        int left = 0;
6        int partition = 0;
7        for(int i=0; i<nums.length-1; i++){
8            left += nums[i];
9            int right = total - left;
10            if(Math.abs(right - left) % 2 == 0) partition++;
11        }
12        return partition;
13    }
14}