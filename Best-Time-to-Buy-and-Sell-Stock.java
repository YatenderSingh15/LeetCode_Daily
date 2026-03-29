1class Solution {
2    public int maxProfit(int[] prices) {
3        int min = Integer.MAX_VALUE;
4        int profit = 0;
5        int max = 0;
6        for(int ele : prices){
7            if(ele < min){
8                min = ele;
9            }
10            else{
11                profit = ele - min;
12                if(profit > max){
13                    max = profit;
14                }
15            }
16        }
17        return max;
18    }
19}