1class Solution {
2    public int countBalls(int lowLimit, int highLimit) {
3        int[] box =new int[46];
4        int maxBalls = 0;
5        for(int i = lowLimit; i <= highLimit; i++){
6            int sum = digitSum(i);
7            box[sum]++;
8            maxBalls=Math.max(maxBalls, box[sum]);
9        }
10        return maxBalls;
11    }
12    static int digitSum(int n){
13        int sum =0;
14        while(n > 0){
15            int rem = n %10;
16            sum = sum + rem;
17            n = n/10;
18        }
19        return sum;
20    }
21}