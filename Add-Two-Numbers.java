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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummyHead = new ListNode();
14        ListNode temp1 =l1;
15        ListNode temp2 = l2;
16        ListNode curr = dummyHead;
17        int carry = 0;
18        while(temp1 != null || temp2 != null){
19            int sum = carry;
20            if(temp1 != null) sum += temp1.val;
21            if(temp2 != null) sum += temp2.val;
22            ListNode newNode = new ListNode(sum % 10);
23            carry = sum / 10;
24
25            curr.next = newNode;
26            curr = curr.next;
27
28            if(temp1 != null) temp1=temp1.next;
29            if(temp2 != null) temp2=temp2.next;
30            if(carry != 0){
31                curr.next = new ListNode(carry);
32            }
33        }
34        return dummyHead.next;
35    }
36}