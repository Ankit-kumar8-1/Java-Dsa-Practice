package DSALeetcode.TwoPointer;

class ListNode14 {
       int val;
       ListNode14 next;
       ListNode14() {}
       ListNode14(int val) { this.val = val; }
       ListNode14(int val, ListNode14 next) { this.val = val; this.next = next; }
   }
public class DeletetheMiddleNodeofaLinkedList {

    public ListNode14 deleteMiddle(ListNode14 head) {
        if(head == null || head.next ==null)  return null;
        ListNode14 slow = head;
        ListNode14 fast =  head;
        ListNode14 pre = null;

        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = slow.next ;
        return head;
    }
}
