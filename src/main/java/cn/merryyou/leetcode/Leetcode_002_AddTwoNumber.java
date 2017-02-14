package cn.merryyou.leetcode;

/**
 *
 * 不懂，太难啦！！！
 * Created on 2017/2/14 0014.
 *
 * @author zlf
 * @since 1.0
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void display(){
        System.out.println(val);
    }
}

public class Leetcode_002_AddTwoNumber {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode x1 = new ListNode(4);
        ListNode x2 = new ListNode(3);
        l1.next = x1;
        x1.next = x2;

        ListNode l2 = new ListNode(5);
        ListNode y1 = new ListNode(6);
        ListNode y2 = new ListNode(4);
        l2.next = y1;
        y1.next = y2;

        ListNode twoNumbers = addTwoNumbers(l1, l2);
        System.out.println(twoNumbers.toString());
//        twoNumbers
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3 = newHead;

        while (p1 != null || p2 != null) {
            if (p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(carry % 10);
            p3 = p3.next;
            carry /= 10;
        }
        if (carry == 1){
            p3.next = new ListNode(1);
        }
        return newHead.next;
    }
}
