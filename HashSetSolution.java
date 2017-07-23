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
        
        HashSet<Integer> set = new HashSet<Integer>();        
        ListNode result = null;
        
        if(headA==null||headB==null) return null;
        
        
            do{
                
                set.add(headA.val);   
                headA = headA.next;
            }
            while(headA!=null);
        
        
            do{
                
                
                if(set.contains(headB.val))
                {
                    if(result == null){
                         result = new ListNode(headB.val);
                    }else{

                        result.next = new ListNode(headB.val);
                    }

                }
                
                headB = headB.next;

            }
            while(headB!=null);


       
        
        return result;        
        
        
    }
}
