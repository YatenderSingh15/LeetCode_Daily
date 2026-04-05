1class Solution {
2    public boolean digitCount(String num) {
3        int[] count = new int[10];
4        for(int i = 0; i < num.length(); i++){
5            count[num.charAt(i) - '0']++;
6        }
7        for(int i = 0; i < num.length(); i++){
8            if(count[i] != num.charAt(i) - '0'){
9                return false;
10            }
11        }
12        return true;
13    }
14}