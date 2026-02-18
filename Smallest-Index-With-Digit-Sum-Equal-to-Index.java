1class Solution {
2    public int smallestIndex(int[] nums) {
3        for (int i = 0; i < nums.length; i++) {
4            int result = 0;
5            while (nums[i] > 0) {
6                int rem = nums[i] % 10;  
7                result += rem;
8                nums[i] = nums[i] /10;
9            }
10            if (result == i) {
11                return i;
12            }
13        }
14        return -1;
15    }
16}