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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummyHead = new ListNode();
14        ListNode tail = dummyHead;
15        while(list1 != null &&list2 != null){
16            if(list1.val < list2.val){
17                tail.next = list1;
18                list1 = list1.next;
19                tail = tail.next;
20            }
21            else{
22                tail.next = list2;
23                list2 = list2.next;
24                tail = tail.next;
25            }
26        }
27        while(list1 != null){
28            tail.next  = list1;
29            list1 = list1.next;
30            tail = tail.next;
31        }
32        while(list2 != null){
33            tail.next  = list2;
34            list2 = list2.next;
35            tail = tail.next;
36        }
37        return dummyHead.next;
38    }
39}