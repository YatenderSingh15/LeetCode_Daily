1class Solution {
2    public String makeSmallestPalindrome(String s) {
3        char[] a = s.toCharArray();
4        int left = 0;
5        int right = a.length - 1;
6        while (left < right) {
7            if (a[left] != a[right]) {
8                char smaller = (char) Math.min(a[left], a[right]);
9                a[left] = a[right] = smaller;
10            }
11            left++;
12            right--;
13        }
14        return new String(a);
15    }
16}