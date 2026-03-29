1class Solution {
2    public int countCompleteDayPairs(int[] hours) {
3        int days = 0;
4        for(int i = 0; i < hours.length; i++){
5            for(int j = i+1; j < hours.length; j++){
6                if((hours[i] + hours[j]) % 24 == 0){
7                    days++;
8                }
9            }
10        }
11        return days;
12    }
13}