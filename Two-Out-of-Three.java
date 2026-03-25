1class Solution {
2    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
3        HashSet<Integer> ans = new HashSet<>();
4        HashSet<Integer> set1 = new HashSet<>();
5        HashSet<Integer> set2 = new HashSet<>();
6        HashSet<Integer> set3 = new HashSet<>();
7        for(int num : nums1){
8            set1.add(num);
9        }
10         for(int num : nums2){
11            set2.add(num);
12        }
13         for(int num : nums3){
14            set3.add(num);
15        }
16        for(int x : set1){
17            if(set2.contains(x) || set3.contains(x)){
18                ans.add(x);
19            }
20        }
21        for(int x : set2){
22            if(set1.contains(x) || set3.contains(x)){
23                ans.add(x);
24            }
25        }
26        for(int x : set3){
27            if(set2.contains(x) || set1.contains(x)){
28                ans.add(x);
29            }
30        }
31       
32        return new ArrayList<>(ans);
33    }
34}