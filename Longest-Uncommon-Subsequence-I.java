1class Solution {
2    public int findLUSlength(String a, String b) {
3        if(a.equals(b)){
4            return -1;
5        }
6        else if(a.length() >= b.length()){
7            return a.length();
8        }
9        else{
10            return b.length();
11        }
12        
13    }
14}