1class Solution {
2    public int countPartitions(int[] nums) {
3        int partition = 0;
4        int leftsum=0;
5        for (int i = 0; i < nums.length-1; i++) {
6            leftsum += nums[i];
7            int rightsum=0;
8            for (int j = i + 1; j < nums.length; j++) {
9                rightsum += nums[j];
10            }
11            if(Math.abs(leftsum-rightsum) % 2 == 0){
12                partition++;
13            }
14        }
15        return partition;
16    }
17}