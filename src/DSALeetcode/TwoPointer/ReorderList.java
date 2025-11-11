package DSALeetcode.TwoPointer;
  class ListNode10 {
      int val;
      ListNode10 next;
      ListNode10() {}
      ListNode10(int val) { this.val = val; }
      ListNode10(int val, ListNode10 next) { this.val = val; this.next = next; }
  }
public class ReorderList {
    public void reorderList(ListNode10 head) {
        ListNode10 slow  = head;
        ListNode10 fast = head;

        while (fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }


        ListNode10 pre = null ;
        ListNode10 curr = slow.next ; slow.next = null ;
        while (curr != null ){
            ListNode10 next = curr .next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        ListNode10 first = head;
        ListNode10 second = pre;

        while (second != null){
            ListNode10 temp = first.next ;
            ListNode10 temp2 = second.next;

            first.next = second ;
            second .next = temp;

            first = temp ;
            second = temp2 ;
        }




    }
}
