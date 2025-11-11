package DSALeetcode.TwoPointer;

class ListNode9 {
       int val;
       ListNode9 next9;
       ListNode9(int x) {
           val = x;
           next9 = null;
       }
   }
public class LinkedListCycleII {
    public  static ListNode9 cycleSNode(ListNode9 head){
        ListNode9 slow = head;
        ListNode9 fast =head;

        while ( fast != null && fast.next9 != null){
            slow = slow.next9;
            fast = fast.next9.next9;

            if(slow == fast){
                slow =head;

                while ( slow != fast){
                    slow = slow.next9;
                    fast = fast.next9;
                }

                return  slow;
            }
        }

        return  null;
    }
}
