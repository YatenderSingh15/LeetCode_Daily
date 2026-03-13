1class Solution {
2    public int arithmeticTriplets(int[] nums, int diff) {
3        int count=0;
4        for(int  i = 0; i<nums.length; i++){
5            for(int j = i+1; j < nums.length; j++){
6                for(int k = j+1; k < nums.length; k++){
7                        if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
8                            count++;
9                        }
10                }
11            }
12        }
13        return count;
14    }
15}