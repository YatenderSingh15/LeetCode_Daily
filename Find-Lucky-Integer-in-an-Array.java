1class Solution {
2    public int findLucky(int[] arr) {
3        int lucky = -1;
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for(int num : arr){
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8        for(int key : map.keySet()){
9            if(map.get(key) == key){
10                lucky = key;
11            }
12        }
13        return lucky;
14    }
15}