1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int l = 0;
5        int e = nums.length-1;
6        int max  = 0;
7        while(l < e){
8            int sum = nums[l] + nums[e];
9            max = Math.max(max, sum);
10            l++;
11            e--;
12        }
13        return max;
14    }
15}