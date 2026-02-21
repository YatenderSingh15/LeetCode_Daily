1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int count=0;
4        HashSet<Integer> set=new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19));
5        for(int i=left; i <= right; i++){
6            int bits=Integer.bitCount(i);
7            if(set.contains(bits)){
8                count++;
9            }
10        }
11        return count;
12    }
13}