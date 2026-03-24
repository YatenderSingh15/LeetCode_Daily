1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] prefix = new int[nums.length];
4        int[] suffix = new int[nums.length];
5        int mul = 1;
6        for(int i = 0; i < nums.length; i++){
7            prefix[i] = mul;
8            mul = mul * nums[i];
9        }
10        mul = 1;
11        for(int i = nums.length-1; i >= 0; i--){
12            suffix[i] = mul;
13            mul = mul * nums[i];
14        }
15        for(int i = 0; i < nums.length; i++){
16            nums[i] = prefix[i] * suffix[i];
17        }
18        return nums;
19    }
20}