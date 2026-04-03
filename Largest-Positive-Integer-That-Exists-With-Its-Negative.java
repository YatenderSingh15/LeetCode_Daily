1class Solution {
2    public int findMaxK(int[] nums) {
3        int largest = -1;
4        for(int i = 0; i < nums.length; i++){
5            for(int j = i+1; j < nums.length; j++){
6                if(nums[i] == -nums[j]){
7                    largest = Math.max(largest, Math.abs(nums[i]));
8                }
9            }
10        }
11        return largest;
12    }
13}