1class Solution {
2    public int similarPairs(String[] words) {
3        int pairs = 0;
4        for(int i = 0; i < words.length; i++){
5            HashSet<Character> set1 = new HashSet<>();
6            for(char c : words[i].toCharArray()){
7                set1.add(c);
8            }
9            for(int j = i+1; j < words.length; j++){
10                HashSet<Character> set2 = new HashSet<>();
11                for(char c : words[j].toCharArray()){
12                    set2.add(c);
13                }
14                if(set1.equals(set2)){
15                    pairs++;
16                }
17            }
18        }
19        return pairs;
20    }
21}