1class Solution {
2    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
3        HashSet<Integer> set1=new HashSet<>();
4        HashSet<Integer> set2 = new HashSet<>();
5        for(int num : nums1){
6            set1.add(num);
7        }
8        for(int num : nums2){
9            set2.add(num);
10        }
11        List<Integer> ans1=new ArrayList<>();
12        List<Integer> ans2=new ArrayList<>();
13        for(int num : set1){
14            if(!set2.contains(num)){
15                ans1.add(num);
16            }
17        }
18        for(int num : set2){
19            if(!set1.contains(num)){
20                ans2.add(num);
21            }
22        }
23        List<List<Integer>> result=new ArrayList<>();
24        result.add(ans1);
25        result.add(ans2);
26        return result;
27    }
28}