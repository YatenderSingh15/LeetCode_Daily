1class Solution {
2    public char repeatedCharacter(String s) {
3        HashSet<Character> set = new HashSet<>();
4        for(char ch : s.toCharArray()){
5            if(set.contains(ch)){
6                return ch;
7            }
8            set.add(ch);
9        }
10        return '0';
11    }
12}