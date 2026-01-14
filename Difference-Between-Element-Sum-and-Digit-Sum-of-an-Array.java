1class Solution {
2    public int differenceOfSum(int[] nums) {
3        int eleSum=0;
4        int digitSum = 0;
5        for(int i=0; i<nums.length; i++){
6            eleSum += nums[i];
7        }
8        for(int i = 0; i < nums.length; i++){
9            while(nums[i] > 0){
10                int rem = nums[i] % 10;
11                digitSum += rem;
12                nums[i] = nums[i] / 10;
13            }
14        }
15        return Math.abs(eleSum - digitSum);
16    }
17}