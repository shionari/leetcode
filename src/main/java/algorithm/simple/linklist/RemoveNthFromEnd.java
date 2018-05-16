package algorithm.simple.linklist;

/**
 *
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * Created by shionari on 2018/5/16
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode parent = new ListNode(-1);
        parent.next = head;
        removeFromEnd(parent, n + 1);
        return parent.next;
    }

    /**
     * 计数加一
     *
     */
    private ListNode removeFromEnd(ListNode head, int n) {
        ListNode node = head;
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        if (node == null) {
            if (n == 2) {
                head.next = null;
            } else {
                head.next = head.next.next;
            }
            return head;
        } else {
            return removeFromEnd(head.next, n);
        }
    }
}
