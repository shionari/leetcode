package algorithm.simple.linklist;

/**
 *
 * 请判断一个链表是否为回文链表。
 *
 * Created by shionari on 2018/5/16
 */
public class IsPalindrome {
    public static void main(String[] args) {
        ListNode start = new ListNode(0);
        ListNode node = start;
        for (int i = 1; i < 10; i++) {
            ListNode inList = new ListNode(i);
            node.next = inList;
            node = inList;
        }
        ListNode temp = start;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(start));
        while(start != null) {
            System.out.println(start.val);
            start = start.next;
        }
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        if (length == 1) {
            return true;
        }

        ListNode startRight = head;
        ListNode startLeft = null;
        ListNode point = head;
        for (int i = 0; i < length/2; i++) {
            startRight = point.next;
            point.next = startLeft;
            startLeft = point;
            point = startRight;
        }
        if (length % 2 == 1) {
            startRight = startRight.next;
        }

        boolean isPalindrome = true;
        for (int i = 0; i < length/2; i++) {
            if (startLeft.val == startRight.val) {
                startLeft = startLeft.next;
                startRight = startRight.next;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
