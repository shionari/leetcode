package algorithm.simple.linklist;

/**
 *
 * 给定一个链表，判断链表中是否有环。
 *
 * 进阶：
 * 你能否不使用额外空间解决此题？
 *
 * Created by shionari on 2018/5/17
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;
        while (fast != null && slow != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast != null) {
                fast = fast.next;
            }
            if (fast != null && fast.equals(slow)) {
                hasCycle = true;
                break;
            }
        }
        return hasCycle;
    }
}
