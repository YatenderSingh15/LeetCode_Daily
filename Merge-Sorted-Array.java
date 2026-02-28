1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m - 1;
4        int j = n - 1;
5        int k = m + n -1;
6
7        while(i >= 0 && j >= 0){
8            if(nums1[i] > nums2[j]){
9                nums1[k--]=nums1[i--];
10            }
11            else{
12                nums1[k--] = nums2[j--];
13            }
14        }
15        while(j >= 0){
16            nums1[k--] = nums2[j--];
17        }
18    }
19    static int[] mergeSort(int[] arr){
20        if(arr.length == 1){
21            return arr;
22        }
23        int mid = arr.length / 2;
24        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
25        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
26        return merge(left,right);
27    }
28    public static int[] merge(int[] first, int[] second){
29        int[] mix = new int[first.length + second.length];
30
31
32        int i = 0;
33        int j = 0;
34        int k = 0;
35
36        while(i < first.length && j < second.length){
37            if(first[i] < second[j]){
38                mix[k] = first[i];
39                i++;
40            }
41            else{
42                mix[k] = second[j];
43                j++;
44            }
45            k++;
46        }
47        while(i < first.length){
48            mix[k] = first[i];
49            i++;
50            k++;
51        }
52        while(j < second.length){
53            mix[k] = second[j];
54            j++;
55            k++;
56        }
57        return mix;
58    }
59}