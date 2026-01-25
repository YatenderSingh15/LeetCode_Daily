1class Solution {
2    public int[] sumZero(int n) {
3        int[] arr = new int[n];
4        int index = 0;
5        int pairs = n/2;
6        for(int i = 1; i <= pairs; i++){
7            arr[index++]=i;
8            arr[index++]=-i;
9        }
10        if(n % 2 == 1){
11            arr[index++]=0;
12        }
13        return arr;
14    }
15}