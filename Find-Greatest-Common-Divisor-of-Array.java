1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        int smallest=nums[0];
5        int largest=nums[nums.length-1];
6        return gcd(smallest, largest);
7    }
8    public int gcd(int a, int b){
9        while(b != 0){
10            int temp = b;
11            b = a % b;
12            a = temp;
13        }
14        return a;
15    }
16}