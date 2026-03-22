1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int substring = 0;
4        for(int i = 0; i < patterns.length; i++){
5            if(word.contains(patterns[i])){
6                substring++;
7            }
8        }
9        return substring;
10    }
11}