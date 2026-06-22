1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int ans = 1;
4        for(String sentence : sentences){
5            int count = 1;
6            for(int i = 0; i < sentence.length(); i++){
7                if(sentence.charAt(i) == ' '){
8                    count++;
9                }
10            }
11            if(count > ans){
12                ans = count;
13            }
14        }
15        return ans;
16    }
17}