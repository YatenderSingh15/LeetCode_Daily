1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        ArrayList<Integer> ans = new ArrayList<>();
5        for(int num : nums){
6            map.put(num,map.getOrDefault(num,0)+1);
7        }
8        for(int key : map.keySet()){
9            if(map.get(key) > nums.length/3){
10                ans.add(key);
11            }
12        }
13        return ans;
14    }
15}