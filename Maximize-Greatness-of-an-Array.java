1class Solution {
2    public int maximizeGreatness(int[] nums) {
3        Arrays.sort(nums);
4        int i = 0;
5        int j =0;
6        int count  = 0;
7        while(j < nums.length){
8            if(nums[j] > nums[i]){
9                count++;
10                i++;
11            }
12            j++;
13        }
14        return count;
15    }
16}