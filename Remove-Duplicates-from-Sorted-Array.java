1class Solution {
2    public int removeDuplicates(int[] nums) {
3        Set<Integer> st = new HashSet<>();
4        for(int i = 0; i< nums.length; i++){
5            st.add(nums[i]);
6        }
7        int index = 0;
8        for(int iterator : st){
9            nums[index] = iterator;
10            index++;
11        }
12        return index;
13    }
14}