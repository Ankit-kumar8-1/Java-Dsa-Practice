package DSALeetcode;

public class RemoveDuplicatesfromSortedArrayII {
    public  static  int returnlen(int [] nums){
        int len = 0 ;

        for(int i : nums){
            if(len <2 || i != nums[len-2]){
                nums[len] = i;
                len++;
            }
        }
        return  len;
    }

    public static void main(String[] args) {
         int arr[]= {1,1,1,2,2,3};
        System.out.println(returnlen(arr));
    }
}
