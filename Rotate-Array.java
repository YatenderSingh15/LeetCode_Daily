1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5        ArrayList<Integer> temp = new ArrayList<>();
6
7        for(int i = n - k; i < n; i++){
8            temp.add(nums[i]);
9        }
10        for(int i = n - k - 1; i >= 0; i--){
11            nums[i + k] = nums[i];
12        }
13        for(int i = 0; i < k; i++){
14            nums[i] = temp.get(i);
15        }
16    }
17}