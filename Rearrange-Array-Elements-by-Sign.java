1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        ArrayList<Integer> pos = new ArrayList<>();
4        ArrayList<Integer> neg = new ArrayList<>();
5        for(int i =0; i < nums.length; i++){
6            if(nums[i] > 0){
7                pos.add(nums[i]);
8            }
9            else{
10                neg.add(nums[i]);
11            }
12        }
13        int p = 0, n = 0, i = 0;
14        while(i < nums.length){
15            nums[i++] = pos.get(p++);
16            nums[i++] = neg.get(n++);
17        }
18        return nums;
19    }
20}