1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int[] arr = new int[nums1.length];
4        for(int i = 0; i < nums1.length; i++){
5            boolean found  = false;
6            for(int j = 0; j < nums2.length; j++){
7                if(nums1[i] == nums2[j]){
8                    for(int k =j+1; k < nums2.length; k++){
9                        if(nums2[k] > nums2[j]){
10                            arr[i] = nums2[k];
11                            found = true;
12                            break;
13                        }
14                    }
15                    if(!found){
16                        arr[i] = -1;
17                    }
18                    break;
19                }
20            }
21        }
22        return arr;
23    }
24}