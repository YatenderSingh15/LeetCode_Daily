1class Solution {
2    public String reverseByType(String s) {
3        List<Character> list1=new ArrayList<>();
4        List<Character> list2 = new ArrayList<>();
5        char[] arr = s.toCharArray();
6        for(int i = 0; i < arr.length; i++){
7            if(Character.isLowerCase(arr[i])){
8                list1.add(arr[i]);
9            }
10            else{
11                list2.add(arr[i]);
12            }
13        }
14        Collections.reverse(list1);
15        Collections.reverse(list2);
16        int l = 0;
17        int q= 0;
18        for(int i = 0; i < arr.length; i++){
19            if(Character.isLowerCase(arr[i])){
20                arr[i] = list1.get(l++);
21            }
22            else{
23                arr[i] = list2.get(q++);
24            }
25        }
26        return new String(arr);
27    }
28}