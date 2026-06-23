1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int start = 0;
4        int end = numbers.length-1;
5        int[] ans = new int[2];
6        while(start <= end){
7            if(numbers[start] + numbers[end] == target){
8                ans[0] = start+1;
9                ans[1] = end+1;
10                break;
11            }
12            else if(numbers[start] + numbers[end] > target){
13                end--;
14            }
15            else{
16                start++;
17            }
18        }
19        return ans;
20    }
21}