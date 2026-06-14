1class Solution {
2    public int minOperations(int[] nums) {
3        int minOp = 0;
4        int n = nums.length;
5        
6        for(int right = 0; right < n - 2; right++){
7                if(nums[right] == 0){
8                nums[right] = 1;
9                nums[right+1] ^= 1;
10                nums[right+2] ^= 1;
11                minOp++;
12                }
13        }
14        return (nums[n-2] == 1 && nums[n-1] ==1) ? minOp : -1;
15    }
16}