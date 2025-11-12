package DSALeetcode;

import java.util.ArrayList;
import java.util.List;

class ListNode12 {
      int val;
       ListNode12 next;
       ListNode12() {}
       ListNode12(int val) { this.val = val; }
       ListNode12(int val, ListNode12 next) { this.val = val; this.next = next; }
   }
public class DeleteNodesFromLinkedListPresentinArray {

    public static ListNode12  returnFinalList(ListNode12 head , int nums[]){
        List<Integer> list =  new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            list.add(nums[i]);
        }

        ListNode12 dummy = new ListNode12(0);
        ListNode12 curr =dummy;

        while (head !=null){
            if(!list.contains(head.val)){
                curr.next = head;
                curr = curr.next;
            }
            head  = head .next;

        }
        return  dummy.next;


    }

    public static void main(String[] args) {

        int nums []= {1,2,3};ListNode12 N = new ListNode12(0);

        System.out.println(returnFinalList(N,nums));
    }
}
