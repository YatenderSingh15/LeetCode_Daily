1class Solution {
2    public int[] maxKDistinct(int[] nums, int k) {
3       
4        HashSet<Integer> set = new HashSet<>();
5        for(int x : nums){
6            set.add(x);
7        }
8        List<Integer> lst= new ArrayList<>(set);
9        lst.sort(Collections.reverseOrder());
10
11        int size = Math.min(k,lst.size());
12         int[] arr = new int[size];
13        for(int i = 0; i < size; i++){
14            arr[i]=lst.get(i);
15        }
16        return arr;
17    }
18}