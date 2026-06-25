1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int ans = 0;
4        for(int left = 0; left < nums.length; left++){
5            int count = 0;
6            for(int right = left; right < nums.length; right++){
7                if(nums[right] == target){
8                    count++;
9                }
10                int length = right - left + 1;
11                if(2 * count > length){
12                    ans++;
13                }
14            }
15        }
16        return ans;
17    }
18}