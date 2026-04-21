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
12    public ListNode sortList(ListNode head) {
13        if(head == null || head.next == null){
14            return head;
15        }
16        ListNode mid = getMid(head);
17        ListNode left = sortList(head);
18        ListNode right = sortList(mid);
19
20        return merge(left,right);
21    }
22    ListNode merge(ListNode list1, ListNode list2){
23        ListNode dummyHead = new ListNode();
24        ListNode tail = dummyHead;
25        while(list1 != null && list2 != null){
26            if(list1.val < list2.val){
27                tail.next = list1;
28                list1 = list1.next;
29                tail = tail.next;
30            }
31            else{
32                tail.next = list2;
33                list2 = list2.next;
34                tail = tail.next;
35            }
36        }
37        tail.next = (list1 != null) ? list1 : list2;
38        return dummyHead.next;
39    }
40    ListNode getMid(ListNode head){
41        ListNode midPrev = null;
42        while(head != null && head.next != null){
43            midPrev = (midPrev == null) ? head : midPrev.next;
44            head = head.next.next;
45        }
46        ListNode mid = midPrev.next;
47        midPrev.next = null;
48        return mid;
49    }
50}