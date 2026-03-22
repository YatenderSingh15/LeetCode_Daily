1class Solution {
2    public int minMoves(int[] nums) {
3        int max  = 0;
4        int moves  = 0;
5        for(int num : nums){
6            max = Math.max(max, num);
7        }
8        for(int num : nums){
9            moves += max - num;
10        }
11        return moves;
12    }
13}