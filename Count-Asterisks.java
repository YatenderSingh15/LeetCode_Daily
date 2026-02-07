1class Solution {
2    public int countAsterisks(String s) {
3        int barcount = 0;
4        int stars = 0;
5        for (char ch : s.toCharArray()) {
6            if (ch == '*') {
7                if (barcount % 2 == 0) {
8                    stars++;
9                }
10            } else if (ch == '|') {
11                barcount++;
12            }
13        }
14        return stars;
15    }
16}

class Solution {
    public int countAsterisks(String s) {

        int barcount = 0;  // Counts how many '|' bars we have seen
                           // Even count  -> we are OUTSIDE the bars
                           // Odd count   -> we are INSIDE the bars
        
        int stars = 0;     // Count of '*' that occur OUTSIDE the bars

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {

            // If we see a bar '|', increase barcount
            // This helps us know when we enter or exit a pair of bars
            if (ch == '|') {
                barcount++;
            }

            // If we see a star '*'
            else if (ch == '*') {

                // We count it only when barcount is even,
                // meaning we are OUTSIDE the paired bars.
                if (barcount % 2 == 0) {
                    stars++;
                }
            }
        }

        // Return the final number of valid stars
        return stars;
    }
}
