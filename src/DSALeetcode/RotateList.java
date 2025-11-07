package DSALeetcode;

class ListNode5 {
    int val;
    ListNode5 next5;
    ListNode5() {}
    ListNode5(int val) { this.val = val; }
    ListNode5(int val, ListNode next) { this.val = val; this.next5 = next5; }
}
public class RotateList {
    public  static  ListNode5 rotateList (ListNode5 head , int k ){
        if(head == null || head.next5 == null || k==0) return  head;

        ListNode5 dummy = head;
        int len = 1;
        while (dummy.next5 != null){
            dummy = dummy.next5;
            len++;
        }

        dummy.next5 = head;

        k = k % len;
        int stepToNewHead = len - k;

        ListNode5 tailNode = head;

        for(int i =1 ; i<stepToNewHead ;i++){
            tailNode = tailNode.next5;
        }

        ListNode5 newHead = tailNode.next5;
        tailNode.next5 = null;

        return  newHead;

    }
}
