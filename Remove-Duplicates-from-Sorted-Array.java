1class Solution {
2    public int removeDuplicates(int[] nums) {
3        Set<Integer> st = new HashSet<>();
4        int index = 0;
5        for(int num : nums){
6            if(!st.contains(num)){
7                st.add(num);
8                nums[index] = num;
9                index++;
10            }
11        }
12        return index;
13    }
14}