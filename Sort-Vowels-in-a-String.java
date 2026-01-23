1class Solution {
2    public String sortVowels(String s) {
3        StringBuilder sb = new StringBuilder();
4        HashSet<Character> vowels = new HashSet<>();
5        for(char c : "AEIOUaeiou".toCharArray()){
6            vowels.add(c);
7        }
8        ArrayList<Character> list = new ArrayList<>();
9        for(char ch : s.toCharArray()){
10            if(vowels.contains(ch)){
11                list.add(ch);
12            }
13            
14        }
15
16        Collections.sort(list);
17        int indx=0;
18        for(char ch : s.toCharArray()){
19            if(vowels.contains(ch)){
20                sb.append(list.get(indx++));
21            }
22            else{
23                sb.append(ch);
24            }
25        }
26        return sb.toString();
27    }
28}