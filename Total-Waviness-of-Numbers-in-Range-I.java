1class Solution {
2    public static int waviness(int x){
3        String s = Integer.toString(x);
4        int count = 0;
5        for(int i = 1; i < s.length()-1; i++){
6            char currChar = s.charAt(i);
7
8            if(currChar < s.charAt(i-1) && currChar < s.charAt(i+1) ||
9            currChar > s.charAt(i-1) && currChar > s.charAt(i+1)){
10                count++;
11            }
12        }
13        return count;
14    }
15    public int totalWaviness(int num1, int num2) {
16        int sum = 0;
17        for(int i = num1; i <= num2; i++){
18            sum += waviness(i);
19        }
20        return sum;
21    }
22}