1class Solution {
2    public int sumDivisibleByK(int[] nums, int k) {
3        int sum = 0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int num : nums){
6            map.put(num, map.getOrDefault(num, 0)+1);
7        }
8        for(int key : map.keySet()){
9            if(map.get(key) % k == 0){
10                sum += key * map.get(key);
11            }
12        }
13        return sum;
14    }
15}