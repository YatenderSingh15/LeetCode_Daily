1class Solution {
2    public int partitionArray(int[] nums, int k) {
3        Arrays.sort(nums);
4        int ans = 1;
5        int min = nums[0];
6        for(int i = 1; i < nums.length; i++){
7            if(nums[i] - min > k){
8                ans++;
9                min = nums[i];
10            }
11        }
12        return ans;
13    }
14}