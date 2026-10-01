package Linked_List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
public class AddOne {
    static ListNode reverse(ListNode head) {
        ListNode prev = null, next = null;
        ListNode curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode addOne(ListNode head) {
        ListNode newHead = reverse(head);
        int carry=1;
        ListNode curr = newHead;
        while(curr!=null){
            int n = curr.val;
            int sum = n+carry;
            if(sum > 9){
                curr.val = sum%10;
                carry=sum/10;
            }
            else{
                curr.val = sum;
                carry=0;
            }
            curr = curr.next;
        }
        if(carry != 0){
            ListNode newNode = new ListNode(carry, null);
            head.next = newNode;
        }
        ListNode result = reverse(newHead);
        return result;
    }
    public static void main(String[] args) {
        //ListNode n1 = new ListNode(3,null);
        ListNode n2 = new ListNode(9,null);
        ListNode n3 = new ListNode(9,n2);
        ListNode n4 = addOne(n3);
        while(n4!=null){
            System.out.print(n4.val + "   ");
            n4=n4.next;
        }
    }
}