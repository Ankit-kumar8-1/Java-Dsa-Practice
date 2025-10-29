package DSALeetcode;

public class IncreasingTripletSubsequence {
    public static boolean isContainTriplet(int nums[]){
        int first = Integer.MAX_VALUE; int second = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<= first){
                first = nums[i];
            }else if (nums[i] <= second){
                second = nums[i];
            }else if(nums[i] > second){
                return  true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int arr[]={20,100,10,12,5,13};
        System.out.println(isContainTriplet(arr));
    }
}
