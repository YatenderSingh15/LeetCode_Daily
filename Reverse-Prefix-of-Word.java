1class Solution {
2    public String reversePrefix(String word, char ch) {
3        StringBuilder sb = new StringBuilder();
4        int index = -1;
5        for(int i = 0; i < word.length(); i++){
6            if(word.charAt(i) == ch){
7                index = i;
8                break;
9            }
10        }
11        if(index == -1)return word;
12        char[] arr=word.toCharArray();
13        int left = 0;
14        int right = index;
15
16        while(left < right){
17            swap(arr, left, right);
18            left++;
19            right--;
20        }
21
22        for(int i = index + 1; i < arr.length; i++){
23            sb.append(arr[i]);
24        }
25        String prefix = "";
26        for(int i =0; i <= index; i++){
27            prefix += arr[i];
28        }
29        return prefix + sb.toString();
30
31    }
32    static void swap(char[] arr, int i, int j){
33        char temp = arr[i];
34        arr[i] = arr[j];
35        arr[j] = temp;
36    }
37}