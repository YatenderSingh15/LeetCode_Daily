class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int rem = 0;
            while(num > 0){
                rem = rem + num % 10;
                num = num/10;
            }
            nums[i] = rem;
        }
        Arrays.sort(nums);
        int min = nums[0];
        return min;
    }
}