1class Solution {
2    public boolean halvesAreAlike(String s) {
3        int vowels=0;
4        s=s.toLowerCase();
5        char c;
6        for(int i =0; i < s.length()/2; i++){
7            c=s.charAt(i);
8            if(c =='a' || c=='e' || c=='i' || c=='o' || c=='u'){
9                vowels++;
10            }
11        }
12        for(int i = s.length()/2; i < s.length(); i++){
13            c=s.charAt(i);
14            if(c =='a' || c=='e' || c=='i' || c=='o' || c=='u'){
15                vowels--;
16            }
17        }
18        return vowels==0;
19    }
20}