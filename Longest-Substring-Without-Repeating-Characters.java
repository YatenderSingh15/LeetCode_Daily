1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set = new HashSet<>();
4        int left = 0;
5        int longestSubstring = 0;
6        for( int right = 0; right < s.length(); right++){
7            char currChar = s.charAt(right);
8            while(set.contains(currChar)){
9                set.remove(s.charAt(left));
10                left++;
11            }
12            set.add(currChar);
13            longestSubstring = Math.max(longestSubstring, right - left + 1);
14        }
15        return longestSubstring;
16    }
17}