1class Solution {
2    public int countAsterisks(String s) {
3        int barcount = 0;
4        int stars = 0;
5        for (char ch : s.toCharArray()) {
6            if (ch == '*') {
7                if (barcount % 2 == 0) {
8                    stars++;
9                }
10            } else if (ch == '|') {
11                barcount++;
12            }
13        }
14        return stars;
15    }
16}