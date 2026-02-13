1class Solution {
2    public int minCostToMoveChips(int[] position) {
3        int even=0;
4        int odd=0;
5        for(int i=0;i<position.length;i++){
6            if(position[i]%2==0)even++;
7            else odd++;
8        }
9        return Math.min(odd,even);
10        
11    }
12}