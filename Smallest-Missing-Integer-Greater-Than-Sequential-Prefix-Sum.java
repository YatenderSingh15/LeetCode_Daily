1class Solution {
2    public int missingInteger(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int x : nums){
5            set.add(x);
6        }
7        int sum = nums[0];
8
9        for(int i = 1; i < nums.length; i++){
10            if(nums[i] == nums[i-1] + 1) sum += nums[i];
11            else break;
12        }
13        while(set.contains(sum)){
14            sum++;
15        }
16        return sum;
17    }
18}