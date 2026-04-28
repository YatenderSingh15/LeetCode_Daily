1class Solution {
2    public int duplicateNumbersXOR(int[] nums) {
3        int ans = 0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int num : nums){
6            map.put(num,map.getOrDefault(num,0)+1);
7            if(map.get(num) == 2){
8                ans ^= num;
9            }
10        }
11        return ans;
12    }
13}