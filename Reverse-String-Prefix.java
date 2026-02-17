1class Solution {
2    public String reversePrefix(String s, int k) {
3        StringBuilder sb=new StringBuilder(s.substring(0,k));
4        sb.reverse();
5        return sb+s.substring(k);
6    }
7}