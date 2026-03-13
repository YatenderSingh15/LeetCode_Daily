1class Solution {
2    public String reversePrefix(String word, char ch) {
3        int index = word.indexOf(ch);
4        if(index == -1)return word;
5
6        char[] arr = word.toCharArray();
7        int left = 0;
8        int right = index;
9        while(left < right){
10            char temp = arr[left];
11            arr[left] = arr[right];
12            arr[right] = temp;
13            left++;
14            right--;
15        }
16        return new String(arr);
17    }
18}