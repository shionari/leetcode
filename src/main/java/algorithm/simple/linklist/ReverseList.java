package algorithm.simple.linklist;

/**
 *
 * 反转一个单链表。
 *
 * Created by shionari on 2018/5/16
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        return reverseList(head, null);
    }

    private ListNode reverseList(ListNode head, ListNode current) {
        ListNode next = head.next;
        head.next = current;
        if (next == null) {
            return head;
        } else {
            return reverseList(next, head);
        }
    }
}
