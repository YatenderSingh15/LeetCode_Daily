1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split(" ");
4        StringBuilder sb = new StringBuilder();
5        for(String word : words){
6            StringBuilder temp = new StringBuilder(word);
7            sb.append(temp.reverse()).append(' ');
8        }
9        return sb.toString().trim();
10    }
11}