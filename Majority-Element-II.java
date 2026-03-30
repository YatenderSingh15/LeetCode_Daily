1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        for(int i =0; i <nums.length; i++){
5            if(ans.contains(nums[i]))continue;
6
7            int count = 0;
8            for(int j = 0; j < nums.length; j++){
9                if(nums[i] == nums[j]){
10                    count++;
11                }
12            }
13            if(count > nums.length/3){
14                ans.add(nums[i]);
15            }
16        }
17        return ans;
18    }
19}