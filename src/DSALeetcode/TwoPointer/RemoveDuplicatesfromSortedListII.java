package DSALeetcode.TwoPointer;

import java.util.List;
import java.util.function.DoubleUnaryOperator;

class ListNode7 {
       int val;
       ListNode7 next7;
       ListNode7() {}
       ListNode7(int val) { this.val = val; }
       ListNode7(int val, ListNode7 next) { this.val = val; this.next7 = next7; }
   }
public class RemoveDuplicatesfromSortedListII {
    public  static ListNode7 removeDeplicate(ListNode7 head){
        ListNode7 dummy = new ListNode7(0);
        dummy.next7 = head;
        ListNode7 pre = dummy;

        while (head != null){
            if(head.next7 != null && head.val == head.next7.val){

                while(head.next7 != null && head.val == head.next7.val){
                    head = head.next7;
                }

                pre.next7 = head.next7;
            }else{
                pre = pre.next7;
            }
            head = head.next7;
        }
        return  dummy.next7;
    }
}
