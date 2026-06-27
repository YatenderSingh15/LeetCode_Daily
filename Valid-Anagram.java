1class Solution {
2    static HashMap<Character,Integer> ans(String str){
3        HashMap<Character,Integer> mp = new HashMap<>();
4        for(char ch : str.toCharArray()){
5            mp.put(ch,mp.getOrDefault(ch,0)+1);
6        }
7        return mp;
8    }
9    public boolean isAnagram(String s, String t) {
10        HashMap<Character,Integer> mp1 = ans(s);
11        HashMap<Character,Integer> mp2 = ans(t);
12        return mp1.equals(mp2);
13    }
14}