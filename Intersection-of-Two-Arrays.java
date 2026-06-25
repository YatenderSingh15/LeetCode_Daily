1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Arrays.sort(nums1);
4        Arrays.sort(nums2);
5        int i = 0;
6        int j = 0;
7        ArrayList<Integer> list = new ArrayList<>();
8        while(i < nums1.length && j < nums2.length){
9            if(nums1[i] == nums2[j]){
10                if(list.isEmpty() || list.get(list.size() - 1) != nums1[i]){
11                    list.add(nums1[i]);
12                    }
13                    i++;
14                    j++;
15                }
16                else if(nums1[i] < nums2[j]){
17                    i++;
18                }
19                else{
20                    j++;
21                }
22        }
23        int[] ans = new int[list.size()];
24        for(int k = 0; k < list.size(); k++){
25            ans[k] = list.get(k);
26        }
27        return ans;
28    }
29}