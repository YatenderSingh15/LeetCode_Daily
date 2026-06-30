1class Solution {
2    public int numberOfSpecialChars(String word) {
3        HashSet<Character> lower = new HashSet<>();
4        HashSet<Character> upper = new HashSet<>();
5        for(char ch : word.toCharArray()){
6            if(Character.isLowerCase(ch)){
7                lower.add(ch);
8            }
9            else{
10                upper.add(Character.toLowerCase(ch));
11            }
12        }
13        int letters = 0;
14        for(char ch : lower){
15            if(upper.contains(ch)){
16                letters++;
17            }
18        }
19        return letters;
20    }
21}