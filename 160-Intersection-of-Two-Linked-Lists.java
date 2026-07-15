/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = 0;
        int size2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(headA != null){
            size1++;
            headA = headA.next;
        }
        while(headB != null){
            size2++;
            headB = headB.next;
        }
        int loop = 0;
        if(size1 >= size2){
            loop = size1 - size2;
            for(int i = 0; i < loop; i++){
                temp1 = temp1.next;
            }
        }
        else{
            loop = size2 - size1;
            for(int i = 0; i < loop; i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                return temp1;
            }
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return null;
    }
}