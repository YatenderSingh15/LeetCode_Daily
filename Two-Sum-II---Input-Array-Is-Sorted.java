1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int[] arr=new int[2];
4        int start = 0;
5        int end = numbers.length-1;
6        while(start < end){
7            if(numbers[start] + numbers[end] == target){
8                arr[0] = start + 1;
9                arr[1] = end + 1;
10                break;
11            }
12            else if(numbers[start] + numbers[end] < target){
13                start++;
14            }
15            else{
16                end--;
17            }
18        }
19        return arr;
20    }
21}