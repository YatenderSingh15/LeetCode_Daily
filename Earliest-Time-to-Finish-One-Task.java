1class Solution {
2    public int earliestTime(int[][] tasks) {
3        int min=Integer.MAX_VALUE;
4        for(int i =0; i<tasks.length; i++){
5            for(int j=0; j < tasks[i].length-1; j++){
6                int result=tasks[i][j]+tasks[i][j+1];
7                min=Math.min(min,result);
8            }
9        }
10        return min;
11    }
12}