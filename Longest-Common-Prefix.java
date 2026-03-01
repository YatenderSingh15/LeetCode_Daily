1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        StringBuilder result = new StringBuilder();
4        Arrays.sort(strs);
5
6        char[] first = strs[0].toCharArray();
7        char[] last= strs[strs.length-1].toCharArray();
8
9
10        for(int i =0; i < first.length; i++){
11            if(first[i] != last[i]){
12                break;
13            }
14            result.append(first[i]);
15        }
16        return result.toString();
17    }
18}