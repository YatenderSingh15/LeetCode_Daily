1class Solution {
2    public int duplicateNumbersXOR(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num : nums){
5            map.put(num, map.getOrDefault(num, 0) + 1);
6        }
7        int ans = 0;
8        for(int key : map.keySet()){
9            if(map.get(key) == 2){
10                ans ^= key;
11            }
12        }
13        return ans;
14    }
15}