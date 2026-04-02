1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int[] nums2=new int[nums1.length];
4        for(int i = 0; i < nums1.length; i++){
5            for(int j = i+1; j < nums1.length; j++){
6                if(nums1[i] % 2 == 0 && nums1[j] % 2 == 0){
7                    nums2[i] = nums1[i];
8                }
9                else if(nums1[i] % 2 != 0 && nums1[j] % 2 != 0){
10                    nums2[i] = nums1[i];
11                }
12                else{
13                    nums2[i] = nums1[i];
14                }
15            }
16        }
17        for(int i =0; i < nums2.length; i++){
18            if(nums2[i] % 2 == 0){
19                return true;
20            }
21        }
22        return false;
23    }
24}