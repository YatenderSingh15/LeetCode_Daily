1class Solution {
2    public int maximumNumberOfStringPairs(String[] words) {
3        int pairs = 0;
4        for(int i = 0; i < words.length; i++){
5            for(int j = i+1; j < words.length; j++){
6                if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)){
7                    pairs++;
8                    break;
9                }
10            }
11        }
12        return pairs;
13    }
14}