1class Solution {
2    public int maxProduct(int n) {
3        int max1=0,max2=0;
4        while(n != 0){
5            int r=n % 10;
6
7            if( r > max1){
8                max2=max1;
9                max1=r;
10            }else if(r > max2){
11                max2 = r;
12            }
13            n /= 10;
14        }
15        return max1 * max2;
16    }
17}