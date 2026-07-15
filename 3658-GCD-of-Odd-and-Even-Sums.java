class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n*n;
        int evenSum = n *(n+1);
        while(oddSum != 0){
            int rem = evenSum % oddSum;
            evenSum = oddSum;
            oddSum = rem;
        }
        return evenSum;
    }
}
