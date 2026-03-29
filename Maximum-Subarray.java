1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n = nums.length;
4        int max = Integer.MIN_VALUE, sum = 0;
5        
6        for(int i=0;i<n;i++){
7            sum += nums[i];
8            max = Math.max(sum,max);
9            
10            if(sum<0) sum = 0;
11        }
12        
13        return max;
14    }
15}