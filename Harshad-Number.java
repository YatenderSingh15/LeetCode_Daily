1class Solution {
2    public int sumOfTheDigitsOfHarshadNumber(int x) {
3        int Harshad=0;
4        int temp = x;
5        while(temp > 0){
6            int rem=temp % 10;
7            Harshad += rem;
8            temp=temp/10;
9        }
10        if(x % Harshad == 0)return Harshad;
11        return -1;
12    }
13}