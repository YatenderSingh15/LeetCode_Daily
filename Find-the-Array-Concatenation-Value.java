1class Solution {
2    public long findTheArrayConcVal(int[] nums) {
3        long concat = 0;
4        int left = 0;
5        int right = nums.length-1;
6        String temp = "";
7        while(left <= right){
8            if(left == right){
9                temp = String.valueOf(nums[left]);
10            }
11            else{
12                temp = String.valueOf(nums[left]) + String.valueOf(nums[right]);
13            }
14            concat += Integer.parseInt(temp);
15            left++;
16            right--;
17        }
18        return concat;
19    }
20}