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
13        if(head == null){
14            return head;
15        }
16        ListNode prev = null;
17        ListNode present = head;
18        ListNode next = present.next;
19
20        while(present != null){
21            present.next = prev;
22            prev = present;
23            present = next;
24            if(next != null){
25                next = next.next;
26            }
27        }
28        return prev; 
29    }
30}