1class Solution {
2    public int balancedStringSplit(String s) {
3        int count = 0;
4        int RCount = 0;
5        int LCount = 0;
6        for (int i = 0; i < s.length(); i++) {
7
8            if (s.charAt(i) == 'L') {
9                LCount++;
10            } else {
11                RCount++;
12            }
13            if (LCount == RCount) {
14                count++;
15            }
16        }
17
18        return count;
19    }
20}