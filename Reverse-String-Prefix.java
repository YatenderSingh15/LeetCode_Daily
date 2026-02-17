1class Solution {
2    public String reversePrefix(String s, int k) {
3        StringBuilder sb=new StringBuilder();
4        sb.append(s);
5        for(int i =1; i<=k; i++){
6            sb.setCharAt(i-1,s.charAt(k-i));
7        }
8        return sb.toString();
9    }
10}