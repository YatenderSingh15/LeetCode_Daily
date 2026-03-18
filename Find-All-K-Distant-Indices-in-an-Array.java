1class Solution {
2    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
3        List<Integer> index = new ArrayList<>();
4        for(int i = 0; i < nums.length; i++){
5            for(int j = 0; j < nums.length; j++){
6                if(nums[j] == key && Math.abs(i-j) <= k){
7                    index.add(i);
8                    break;
9                }
10            }
11        }
12        return index;
13    }
14}