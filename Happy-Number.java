1class Solution {
2    public boolean isHappy(int n) {
3        int slow = n;
4        int fast = n;
5        
6        do{
7            slow = findSquare(slow);
8            fast = findSquare(findSquare(fast));
9        }
10        while(slow != fast);
11        if(slow == 1){
12            return true;
13        }
14
15        return false;
16    }
17    public int findSquare(int number){
18        int ans = 0;
19        while(number > 0){
20            int rem = number % 10;
21            ans += rem * rem;
22            number = number/10;
23        }
24        return ans;
25    }
26}