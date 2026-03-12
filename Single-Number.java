1class Solution {
2    public int singleNumber(int[] nums) {
3        int xor = 0;
4        for(int num : nums){
5            xor = xor ^ num;
6        }
7        return xor;
8    }
9}