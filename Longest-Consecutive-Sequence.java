1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length == 0)return 0;
4        Arrays.sort(nums);
5        int count = 0;
6        int longest = 1;
7        int lastSmallest = Integer.MIN_VALUE;
8        for(int i = 0; i < nums.length; i++){
9            if(nums[i] - 1 == lastSmallest){
10                count++;
11                lastSmallest = nums[i];
12            }
13            else if(nums[i] != lastSmallest){
14                count = 1;
15                lastSmallest = nums[i];
16            }
17            longest = Math.max(longest, count);
18        }
19        return longest;
20    }
21}