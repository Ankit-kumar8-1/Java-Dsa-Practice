package DSALeetcode;

public class ProductofArrayExceptSelf {
    public  static int[] productArray(int nums[]){
        int res[]= new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1] * nums[i-1];
        }

        int last =1;
        for (int i = nums.length-2;i>=0;i--){
            last = last * nums [i+1];
            res[i]*=last;
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int nums[]=productArray(arr);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
