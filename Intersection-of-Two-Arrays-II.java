1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        boolean[] used = new boolean[nums2.length];
4        ArrayList<Integer> list = new ArrayList<>();
5        for(int i = 0; i < nums1.length; i++){
6            for(int j = 0; j < nums2.length; j++){
7                if(nums1[i] == nums2[j] && used[j] != true){
8                    list.add(nums1[i]);
9                    used[j] = true;
10                    break;
11                }
12            }
13        }
14        int[] ans = new int[list.size()];
15        for(int i =0; i < list.size(); i++){
16            ans[i] = list.get(i);
17        }
18        return ans;
19    }
20}