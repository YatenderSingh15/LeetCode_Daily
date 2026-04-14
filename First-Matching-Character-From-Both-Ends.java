1class Solution {
2    public int firstMatchingIndex(String s) {
3        int ans = -1;
4        int l = 0;
5        int r = s.length()-1;
6        while(l <= r){
7            if(s.charAt(l) == s.charAt(r)){
8                ans = l;
9                break;
10            }
11            else{
12                l++;
13                r--;
14            }
15        }
16        return ans;
17    }
18}