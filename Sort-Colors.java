1class Solution {
2    public void sortColors(int[] nums) {
3        int count0 = 0;
4        int count1 = 0;
5        int count2 = 0;
6        for(int i = 0; i < nums.length; i++){
7            if(nums[i] == 0) count0++;
8            else if(nums[i] == 1) count1++;
9            else count2++;
10        }
11        int index = 0;
12        while(count0-- > 0){
13            nums[index] = 0;
14            index++;
15        }
16        while(count1-- > 0){
17            nums[index] = 1;
18            index++;
19        }
20        while(count2-- > 0){
21            nums[index] = 2;
22            index++;
23        }
24    }
25}