1class Solution {
2    public int sumOfUnique(int[] nums) {
3        int ans = 0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int num : nums){
6            map.put(num, map.getOrDefault(num, 0)+1);
7        }
8        for(int num : map.keySet()){
9            if(map.get(num) == 1){
10                ans += num;
11            }
12        }
13        return ans;
14    }
15}