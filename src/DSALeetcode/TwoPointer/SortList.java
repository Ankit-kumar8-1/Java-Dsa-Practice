package DSALeetcode.TwoPointer;

class ListNode11 {
       int val;
       ListNode11 next;
       ListNode11() {}
       ListNode11(int val) { this.val = val; }
       ListNode11(int val, ListNode11 next) { this.val = val; this.next = next; }
   }
public class SortList {
    public  static  ListNode11 sortList(ListNode11 head){

        if(head == null || head.next == null ) return  head;

        ListNode11 mid = findmid(head);
        ListNode11 right = mid.next;
        mid.next = null;

        ListNode11 leftSorted = sortList(head);
        ListNode11 rightSorted = sortList(right);

        return  merge(leftSorted,rightSorted);

    }
    public  static  ListNode11 findmid(ListNode11 head ){
        ListNode11 slow = head;
        ListNode11 fast = head.next;

        while (fast != null && fast.next ==null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }

    public  static  ListNode11 merge(ListNode11 l1 ,ListNode11 l2){
        ListNode11 dummy =  new ListNode11(0);
        ListNode11 curr =  dummy;

        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr .next;
        }

        if(l1 != null)   curr.next = l1;
        if(l2 != null ) curr .next = l2;

        return dummy.next;
    }
}
