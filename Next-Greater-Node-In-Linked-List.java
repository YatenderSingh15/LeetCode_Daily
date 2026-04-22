1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nextLargerNodes(ListNode head) {
13        List<Integer> list = new ArrayList<>();
14        ListNode temp = head;
15        while(temp != null){
16            list.add(temp.val);
17            temp = temp.next;
18        }
19        int[] result = new int[list.size()];
20        for(int i = 0; i < list.size(); i++){
21            int currentVal = list.get(i);
22            for(int j = i+1; j < list.size(); j++){
23                if(list.get(j) > currentVal){
24                    result[i] = list.get(j);
25                    break;
26                }
27            }
28        }
29        return result; 
30    }
31}