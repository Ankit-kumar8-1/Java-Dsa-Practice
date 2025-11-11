package DSALeetcode.TwoPointer;

  class ListNode8 {
       int val8;
       ListNode8 next8;
       ListNode8(int x) {
           val8 = x;
           next8 = null;
       }
  }
public class LinkedListCycle {
    public  static boolean isCycle(ListNode8 head){
        if(head == null || head.next8 ==null) return  false;
        ListNode8 slow = head;
        ListNode8 fast = head ;

        while (fast != null && fast.next8 != null){
            if(fast == slow ){
                return  true;
            }

            slow = slow.next8;
            fast = fast.next8.next8;
        }

        return  false;
    }
}
