1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3      HashSet<Integer> set =  new HashSet<>();
4      for(int i = 0; i < nums.length; i++){
5        if(set.contains(nums[i])){
6            return true;
7        }
8        set.add(nums[i]);
9        if(i >= k){
10            set.remove(nums[i-k]);
11        }
12      }  
13      return false;
14    }
15}