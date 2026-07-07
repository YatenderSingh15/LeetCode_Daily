class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            int sum = 0;
            while(num > 0){
                sum = sum + num % 10;
                num = num/10;
            }
            num = sum;
            min = Math.min(min,num);
        }
        return min;
    }
}