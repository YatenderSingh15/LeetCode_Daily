1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int[] arr = new int[nums.length];
4        int left = 0;
5        int right = nums.length-1;
6        int index = nums.length-1;
7        while(left <= right){
8            int leftsquare = nums[left] * nums[left];
9            int rightsquare = nums[right] * nums[right];
10            
11            if(leftsquare > rightsquare){
12                arr[index] = leftsquare;
13                left++;
14            }else{
15                arr[index] = rightsquare;
16                right--;
17            }
18            index--;
19        }
20        return arr;
21    }
22}