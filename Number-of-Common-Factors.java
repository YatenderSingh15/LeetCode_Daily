1class Solution {
2    public int commonFactors(int a, int b) {
3        int factor=0;
4        for(int i =1; i<=a; i++){
5            if(a % i == 0 && b % i == 0){
6                factor++;
7            }
8        }
9        return factor;
10    }
11}