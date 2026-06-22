1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int[] freq = new int[26];
4        for(char ch : text.toCharArray()){
5            freq[ch - 'a']++;
6        }
7        return Math.min(Math.min(freq['b' - 'a'],freq['a' - 'a']), Math.min(Math.min(freq['l' - 'a']/2,freq['o' - 'a']/2),freq['n' - 'a']));
8    }
9}