1class Solution {
2    static void swap(int[] arr, int start, int end){
3        int temp = arr[start];
4        arr[start] = arr[end];
5        arr[end] = temp;
6    }
7    public void moveZeroes(int[] nums) {
8        int j = -1;
9        for(int i =0; i < nums.length; i++){
10            if(nums[i] == 0){
11                j = i;
12                break;
13            }
14        }
15        if(j == -1)return;
16        for(int i = j+1; i < nums.length; i++){
17            if(nums[i] != 0){
18                swap(nums, i, j);
19                j++;
20            }
21        }
22    }
23}