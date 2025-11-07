package DSALeetcode;

class ListNode2 {
    int val;
    ListNode2 next2;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode next) { this.val = val; this.next2 = next2; }
}
public class AddTwoNumbers {

    public  static  ListNode2 addtwonumber(ListNode2 list1 , ListNode2 list2){
        ListNode2 dummy = new ListNode2(0);
        ListNode2 curr = dummy;
        int carry = 0;

        while (list1 != null || list2!= null ){
            int a = (list1 != null )? list1.val : 0;
            int  b = (list2 != null ) ? list2.val :0;

            int sum = a+b+carry;
            carry = sum / 10;

            curr.next2 =  new ListNode2(sum % 10);
            curr = curr .next2;

            if(list1 != null) list1 = list1.next2;
            if(list2 != null) list2 = list2.next2;

        }

        if(carry > 0){
            curr.next2 = new ListNode2(carry);
        }

        return  dummy.next2;
    }
}

