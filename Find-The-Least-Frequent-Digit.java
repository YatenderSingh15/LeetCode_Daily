1class Solution {
2    public int getLeastFrequentDigit(int n) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        while(n > 0){
5            int last = n % 10;
6            map.put(last, map.getOrDefault(last,0)+1);
7            n = n/10;
8        }
9        int minfreq = Integer.MAX_VALUE;
10        int ans = Integer.MIN_VALUE;
11        for(int key : map.keySet()){
12            int freq = map.get(key);
13            if(freq < minfreq){
14                minfreq = freq;
15                ans = key;
16            }
17            else if(minfreq == freq){
18                ans = Math.min(ans,key);
19            }
20        }
21        return ans;
22    }
23}