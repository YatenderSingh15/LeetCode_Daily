1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int n : nums){
5            set.add(n);
6        }
7        int maxLen = 0;
8        for(int num : set){
9            if(!set.contains(num-1)){
10                int currentNum = num;
11                int currentLen = 1;
12                while(set.contains(currentNum+1)){
13                    currentLen++;
14                    currentNum++;
15                }
16                maxLen=Math.max(maxLen,currentLen);
17            }
18        }
19        return maxLen;
20    }
21}