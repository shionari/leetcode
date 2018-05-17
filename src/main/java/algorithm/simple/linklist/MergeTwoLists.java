package algorithm.simple.linklist;

/**
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * Created by shionari on 2018/5/16
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(0);
        merge(start, l1, l2);
        return start.next;
    }

    private void merge(ListNode start, ListNode l1, ListNode l2) {
        if (l1 == null) {
            start.next = l2;
            return;
        } else if (l2 == null) {
            start.next = l1;
            return;
        }
        if (l1.val < l2.val) {
            start.next = l1;
            l1 = l1.next;
        } else {
            start.next = l2;
            l2 = l2.next;
        }
        merge(start.next, l1, l2);
    }
}
