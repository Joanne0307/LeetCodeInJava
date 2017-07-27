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
         ListNode pointerA = headA;
         ListNode pointerB = headB;
        
         if(headA==null||headB==null) return null;
        
         while(pointerA!=pointerB){
             
             pointerA = pointerA==null?headB:pointerA.next;
             pointerB = pointerB==null?headA:pointerB.next;
              
         }
      
         return pointerA;
        
    }
}

/*
referenced list 
https://discuss.leetcode.com/topic/28067/java-solution-without-knowing-the-difference-in-len
*/
