1class Solution {
2    public int numOfPairs(String[] nums, String target) {
3       
4        int pairs = 0;
5        for(int i = 0; i < nums.length; i++){
6            for(int j = 0; j < nums.length; j++){
7                if(i != j){
8                    StringBuilder sb = new StringBuilder(nums[i]);
9                    sb.append(nums[j]);
10                    if(sb.toString().equals(target)){
11                        pairs++;
12                    }
13                }
14            }
15        }
16        return pairs;
17    }
18}