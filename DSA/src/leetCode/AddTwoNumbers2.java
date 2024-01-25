package leetCode;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        int a[] = {1, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        long sum = 0;
        for (int i = 0; i < a.length; i++) {

            sum += a[i] * Math.pow(10, i);


        }

        //   System.out.println(sum);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = null;
        ListNode tempNode = null;
        int num = 0;
        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                num = l1.val + l2.val;
                if (carry != 0) {
                    num += carry;
                }
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null) {
                tempNode = l2;
                break;
            } else if (l2 == null) {
                tempNode = l1;
                break;
            }
            carry = num / 10;
            num %= 10;
            ListNode node = new ListNode(num);
            if (headNode == null) {
                headNode = new ListNode(num);
                tempNode = headNode;
            } else {
                tempNode = node;
            }
            tempNode = tempNode.next;
        }
        if (carry != 0) {
            tempNode = new ListNode(carry);
        }
        return headNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}