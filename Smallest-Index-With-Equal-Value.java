1class Solution {
2    public int smallestEqual(int[] nums) {
3        for(int i =0; i < nums.length; i++){
4            if(i % 10 == nums[i]){
5                return i;
6            }
7        }
8        return -1;
9    }
10}