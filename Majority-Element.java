1class Solution {
2    public int majorityElement(int[] nums) {
3        int count = 0;
4        int element  = 0;
5        for(int i = 0; i < nums.length; i++){
6            if(count == 0){
7                count = 1;
8                element = nums[i];
9            }
10            else if(nums[i] == element){
11                count++;
12            }
13            else{
14                count--;
15            }
16        }
17        return element;
18    }
19}