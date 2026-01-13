1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3        int count = 0;
4        HashSet<Character> set = new HashSet<>();
5        for(int i =0; i<allowed.length(); i++){
6            set.add(allowed.charAt(i));
7        }
8        for(int i = 0; i < words.length; i++){
9            int flag = 0;
10            for(int j = 0; j < words[i].length(); j++){
11                if(!set.contains(words[i].charAt(j))){
12                    flag = 1;
13                    break;
14                }
15            }
16            if(flag == 0){
17                count++;
18            }
19        }
20        return count;
21    }
22}