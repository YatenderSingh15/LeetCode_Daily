1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int X = 0;
4        for(int i=0; i < operations.length; i++){
5            if(operations[i].contains("+")){
6                X++;
7            }else{
8                X--;
9            }
10        }
11        return X;
12    }
13}