1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        ArrayList<Integer> list = new ArrayList<>();
4        for(int i = 0; i < arr2.length; i++){
5            for(int j = 0; j < arr1.length; j++){
6                if(arr2[i] == arr1[j]){
7                    list.add(arr1[j]);
8                }
9            }
10        }
11        ArrayList<Integer> remaining = new ArrayList<>();
12        for(int num : arr1){
13            boolean found = false;
14            for(int x : arr2){
15                if(num == x){
16                    found = true;
17                    break;
18                }
19            }
20            if(!found){
21                remaining.add(num);
22            }
23        }
24        Collections.sort(remaining);
25        list.addAll(remaining);
26        int[] arr = new int[list.size()];
27        for(int i = 0; i < arr.length; i++){
28            arr[i] = list.get(i);
29        }
30        return arr;
31    }
32}