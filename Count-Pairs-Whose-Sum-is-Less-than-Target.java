1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int pairs = 0;
4        for(int i = 0; i<nums.size(); i++){
5            for(int j = i+1; j < nums.size(); j++){
6                if(nums.get(i) + nums.get(j) < target){
7                    pairs++;
8                }
9            }
10        }
11        return pairs;
12    }
13}
This is a classic Math trick based on number base conversion.

To convert a number from base 10 to any other base k, we:

Keep dividing the number by k

Store the remainders — these are the digits of the number in base k, from least significant to most significant.

But here, instead of storing the digits, we’re just adding the remainders on the fly — because the question only asks for the sum of digits in base k.
Example:
To convert 100 to base 6:

1 .100 % 6 = 4 → 100 / 6 = 16

2 .16 % 6 = 4 → 16 / 6 = 2

2 % 6 = 2 → 2 / 6 = 0
→ Digits: 2, 4, 4 → Sum = 10
So, no need to actually build the base-k number — just keep summing n % k while updating n = n / k.
