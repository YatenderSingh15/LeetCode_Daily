1class Solution {
2    public int sumBase(int n, int k) {
3        int ans =0;
4        while(n > 0){
5            int temp = n % k;
6            ans += temp;
7            n = n / k;
8        }
9        return ans;
10    }
11}