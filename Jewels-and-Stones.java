1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        HashSet<Character> set = new HashSet<>();
4        int count = 0;
5        for(char ch : jewels.toCharArray()){
6            set.add(ch);
7        }
8        for(char ch : stones.toCharArray()){
9            if(set.contains(ch)){
10                count++;
11            }
12        }
13        return count;
14    }
15}