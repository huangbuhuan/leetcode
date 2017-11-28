package main.java.demo;


/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/28
 */
public class Solution83 {
    
    
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    
}
