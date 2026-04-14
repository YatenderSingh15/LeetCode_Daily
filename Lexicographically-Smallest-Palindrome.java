1class Solution {
2    public String makeSmallestPalindrome(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i = 0; i < s.length(); i++){
5            sb.append(Character.toString(Math.min(s.charAt(i), s.charAt(s.length() - i - 1))));
6        }
7        return sb.toString();
8    }
9}