1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int pairs = 0;
4        for(int i = 0; i<nums.size(); i++){
5            for(int j = i+1; j < nums.size(); j++){
6                if(nums.get(i) + nums.get(j) < target){
7                    pairs++;
8                }
9            }
10        }
11        return pairs;
12    }
13}