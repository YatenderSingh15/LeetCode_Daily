1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int maxlen = 0;
4        int left = 0;
5        HashSet<Character> set = new HashSet<>();
6        for(int right = 0; right < s.length(); right++){
7            char currchar = s.charAt(right);
8            while(set.contains(currchar)){
9                set.remove(s.charAt(left));
10                left++;
11            }
12            set.add(currchar);
13            maxlen = Math.max(maxlen, right - left +1);
14        }
15        return maxlen;
16    }
17}