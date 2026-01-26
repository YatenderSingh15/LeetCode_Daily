1class Solution {
2    public int maxContainers(int n, int w, int maxWeight) {
3        int cell = n*n;
4        int totalWeight = cell * w;
5        if(totalWeight < maxWeight){
6            return totalWeight/w;
7        }
8        return maxWeight/w;
9    }
10}