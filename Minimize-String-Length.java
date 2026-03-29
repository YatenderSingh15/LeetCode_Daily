1class Solution {
2    public int minimizedStringLength(String s) {
3        HashSet<Character> set = new HashSet<>();
4        char[] arr=s.toCharArray();
5        for(char c : arr){
6            if(!set.contains(c)){
7                set.add(c);
8            }
9        }
10        return set.size();
11    }
12}