/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;

        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        slow = reverseList(slow);
        fast = head;
      
        while( slow != null){
            if(fast.val != slow.val)
                return false;

                fast = fast.next;
                slow = slow.next;
            
        }

        return true ;  
    }


    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nexttemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexttemp;
        }

        return prev;
    }
}