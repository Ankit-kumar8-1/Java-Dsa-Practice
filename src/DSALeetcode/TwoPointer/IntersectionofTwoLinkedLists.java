package DSALeetcode.TwoPointer;

import java.util.List;

class ListNode13 {
       int val;
       ListNode13 next;
       ListNode13(int x) {
           val = x;
          next = null;
       }
  }
public class IntersectionofTwoLinkedLists {

    public  static ListNode13 getInteractionNode (ListNode13 headA , ListNode13 headB){
        ListNode13 first = headA ;
        ListNode13 second = headB;
        int len1 = 0,len2 =0;
        while(first != null || second != null){
            if(first != null){
                len1++;
                first = first.next;
            }else {
                len2++;
                second = second.next;
            }
        }

        if(len1 > len2){
            for(int i = 0;i<len1 -len2 ;i++){
                headA = headA.next;
            }
        }else{
            for(int i = 0; i<len2 -len1 ;i++){
                headB = headB.next;
            }
        }

        while (headA != headB){
            if(headA == null || headB ==null) return  null;
            headA =headA.next;
            headB = headB.next;
        }

        return headA;
    }
}
