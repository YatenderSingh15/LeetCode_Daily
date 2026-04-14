1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        int l = 0, r = 0;
4        StringBuilder sb = new StringBuilder();
5        while(l < word1.length() && r < word2.length()){
6            sb.append(word1.charAt(l));
7            l++;
8            sb.append(word2.charAt(r));
9            r++;
10        }
11        while(l < word1.length()){
12            sb.append(word1.charAt(l));
13            l++;
14        }
15        while(r < word2.length()){
16            sb.append(word2.charAt(r));
17            r++;
18        }
19        return sb.toString();
20    }
21}