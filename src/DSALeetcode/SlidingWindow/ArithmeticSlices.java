package DSALeetcode.SlidingWindow;

public class ArithmeticSlices {
    public  static  int numberofslices(int nums[]){
        int curr = 0;
        int count = 0;

        for(int i =2 ;i<nums.length;i++){
            if(nums[i] - nums[i-1] ==nums[i-1] -nums[i-2]){
                curr+=1;
                count+=curr;
            }else {
                curr = 0;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(numberofslices(nums));
    }
}
