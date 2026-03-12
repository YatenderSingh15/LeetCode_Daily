1class Solution {
2    public int singleNumber(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num : nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7        for(int key : map.keySet()){
8            if(map.get(key) == 1){
9                return key;
10            }
11        }
12        return -1;
13    }
14}