package DSALeetcode;

class ListNode3 {
       int val;
       ListNode3 next3;
       ListNode3() {}
       ListNode3(int val) { this.val = val; }
       ListNode3(int val, ListNode next) { this.val = val; this.next3 = next3; }
  }
public class RemoveNthNodeFromEndofList {
    public  static  ListNode3 removeNthNode(ListNode3 head , int n){
        ListNode3 dummy = new ListNode3(0);
        dummy.next3 = head;

        ListNode3 fast = dummy;
        ListNode3 slow = dummy;

        for(int i =0 ;i<=n ;i++){
            fast =fast.next3;
        }

        while (fast != null){
            fast =fast.next3;
            slow = slow.next3;
        }

        slow.next3 = slow.next3.next3;
        return  dummy.next3;
    }

}
