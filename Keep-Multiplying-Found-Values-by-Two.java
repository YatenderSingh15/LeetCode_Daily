1class Solution {
2    public int findFinalValue(int[] nums, int original) {
3        while(true){
4            boolean found = false;
5
6            for(int num : nums){
7                if(num == original){
8                    original = original * 2;
9                    found = true;
10                    break;
11                }
12            }
13            if(!found){
14                break;
15            }
16        }
17        return original;
18    }
19}