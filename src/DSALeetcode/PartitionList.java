package DSALeetcode;


class ListNode6 {
    int val;
    ListNode6 next6;
    ListNode6() {}
    ListNode6(int val) { this.val = val; }
    ListNode6(int val, ListNode next) { this.val = val; this.next6 = next6; }
}
public class PartitionList {
    public  static  ListNode6 partitionList (ListNode6 head , int x ){

        ListNode6 beforelist = new ListNode6(0);
        ListNode6 afterlist = new ListNode6(0) ;
        ListNode6  before = beforelist;
        ListNode6 after = afterlist;

        while ( head != null ){
            if(head.val < x){
                before.next6 =head;
                before = before.next6;
            }else {
                after.next6 = head;
                after = after.next6;
            }
            head = head.next6;
        }

        after.next6 =null;
        before.next6 = afterlist.next6;
        return  beforelist.next6;
    }

    public static void main(String[] args) {

    }
}
