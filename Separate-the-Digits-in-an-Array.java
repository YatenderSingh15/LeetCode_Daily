1class Solution {
2    public int[] separateDigits(int[] nums) {
3        List<Integer> arr = new ArrayList<>();
4        for(int num : nums){
5            List<Integer> temp=new ArrayList<>();
6            while(num > 0){
7                temp.add(num % 10);
8                num = num/10;
9            }
10            Collections.reverse(temp);
11            arr.addAll(temp);
12        }
13        int[] result=new int[arr.size()];
14        int idx =0;
15        for(int num: arr){
16            result[idx]=num;
17            idx++;
18        }
19        return result;
20    }
21}