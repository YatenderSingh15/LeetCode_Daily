1class Solution {
2    public int[] distinctDifferenceArray(int[] nums) {
3        int[] diff = new int[nums.length];
4        int index = 0;
5        for(int i = 0; i < nums.length; i++){
6            HashSet<Integer> prefix = new HashSet<>();
7            for(int j = 0; j <= i; j++){
8                prefix.add(nums[j]);
9            }
10            HashSet<Integer> suffix = new HashSet<>();
11            for(int k = i+1; k <nums.length; k++){
12                suffix.add(nums[k]);
13            }
14            diff[index] = prefix.size() - suffix.size();
15            index++;
16        }
17        return diff;
18    }
19}