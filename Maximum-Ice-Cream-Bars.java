1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int icecreams = 0;
5        for(int i = 0; i < costs.length; i++){
6            if(costs[i] <= coins){
7                icecreams++;
8                coins = coins - costs[i];
9            }
10        }
11        return icecreams;
12    }
13}