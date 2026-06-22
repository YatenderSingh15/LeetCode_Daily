1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder sb = new StringBuilder();
4
5        while(columnNumber > 0){
6            columnNumber--;
7            sb.insert(0, (char)((columnNumber % 26) + 'A'));
8            columnNumber /= 26;
9        }
10        return sb.toString();
11    }
12}