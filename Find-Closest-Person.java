1class Solution {
2    public int findClosest(int x, int y, int z) {
3        int xcount =Math.abs(x-z);
4        int ycount = Math.abs(y-z);
5        
6        if(xcount < ycount){
7            return 1;
8        }
9        else if(xcount > ycount){
10            return 2;
11        }
12        else{
13            return 0;
14        }
15    }
16}