1class Solution {
2    public int singleNumber(int[] nums) {
3        int ans = 0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int x : nums){
6            map.put(x, map.getOrDefault(x,0)+1);
7        }
8        for(int key : map.keySet()){
9            int value = map.get(key);
10            if(value == 1){
11                ans = key;
12            }
13        }
14        return ans;
15    }
16}