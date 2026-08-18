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
    public boolean hasCycle(ListNode head) {
        ListNode fast = head; // moves 2 step at a time
        ListNode slow = head; // moves 1 step at a time

// if there's no cycle, the fast pointer will reach the end of the list first and thus return false.
// if there's a cycle, the slow pointer will eventually catch up and thus 'fast == slow' returning true.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            // if a cycle exist, fast and slow points to the same node
            if (fast == slow) {
                return true;
            }
        }
        return false; // fast pointer reached the end of the list
    }
}
