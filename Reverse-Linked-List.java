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
12    public ListNode reverseList(ListNode head) {
13        ListNode prev = null;
14        ListNode present = head;
15        
16
17        while(present != null){
18            ListNode next = present.next;
19            present.next = prev;
20            prev = present;
21            present = next;
22            if(next != null){
23                next = next.next;
24            }
25        }
26        return prev; 
27    }
28}