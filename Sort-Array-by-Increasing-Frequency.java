1class Solution {
2    public int[] frequencySort(int[] nums) {
3        HashMap<Integer,Integer> mp=new HashMap<>();
4        for(int num : nums){
5            if(!mp.containsKey(num)){
6                mp.put(num,1);
7            }
8            else{
9                mp.put(num,mp.get(num)+1);
10            }
11        }
12        Integer[] arr=new Integer[nums.length];
13        for(int i = 0; i<nums.length; i++){
14            arr[i]=nums[i];
15        }
16        Arrays.sort(arr,(a,b) -> {
17            if(mp.get(a) != mp.get(b)){
18                return mp.get(a) - mp.get(b);
19            }
20            return b - a;
21        });
22        for(int i=0; i<nums.length; i++){
23            nums[i]=arr[i];
24        }
25        return nums;
26    }
27}