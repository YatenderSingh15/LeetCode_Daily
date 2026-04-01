1class Solution {
2    public int minNumberOperations(int[] target) {
3        int count = target[0];
4        for(int i = 1; i < target.length; i++){
5            if(target[i] > target[i-1]){
6                count += target[i] - target[i-1];
7            }
8        }
9        return count;
10    }
11}