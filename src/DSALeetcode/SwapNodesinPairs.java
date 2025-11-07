package DSALeetcode;



class ListNode4 {
       int val;
       ListNode4 next4;
       ListNode4() {}
       ListNode4(int val) { this.val = val; }
       ListNode4(int val, ListNode next) { this.val = val; this.next4 = next4; }
   }

public class SwapNodesinPairs {
     public  static  ListNode4 swapcode(ListNode4 head) {
         ListNode4 dummy = new ListNode4(0);
         dummy.next4 = head;
         ListNode4 previous = dummy;

         while ( head != null && head.next4 != null){
             ListNode4 first = head ;
             ListNode4 second = head.next4;

             first.next4 = second.next4 ;
             second.next4 = first;
             previous.next4 = second;

             previous = first;
             head =first.next4;
         }
         return  dummy.next4;
     }
}
