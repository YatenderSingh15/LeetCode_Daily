1class Solution {
2    public static void reverse(int[]arr , int i , int j ){
3        while( i < j ){
4            int t = arr[i]; 
5            arr[i] = arr[j]; 
6            arr[j] = t ; 
7            i++; 
8            j--; 
9        }
10    }
11    public void rotate(int[] nums, int k) {
12        k = k %nums.length ; 
13        reverse( nums  , 0 , nums.length-1 ); 
14        reverse( nums , 0 , k-1); 
15        reverse(nums,  k  , nums.length-1); 
16    }
17}