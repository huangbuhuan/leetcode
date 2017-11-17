package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/16
 */
public class Solution206 {
    
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode reverseNode = null;
        ListNode currentNode = head;
        ListNode prevNode = null;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            if (nextNode == null) {
                reverseNode = currentNode;
            }
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return reverseNode;
    }
    
}
