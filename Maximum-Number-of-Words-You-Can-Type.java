1class Solution {
2    public int canBeTypedWords(String text, String brokenLetters) {
3        int count = 0;
4        HashSet<Character> set = new HashSet<>();
5        for(char ch : brokenLetters.toCharArray()){
6            set.add(ch);
7        }
8        String[] arr=text.split(" ");
9        for(String word : arr){
10            boolean canType = true;
11
12            for(char c : word.toCharArray()){
13                if(set.contains(c)){
14                    canType = false;
15                    break;
16                }
17            }
18            if(canType){
19                count++;
20            }
21        }
22        return count;
23    }
24}