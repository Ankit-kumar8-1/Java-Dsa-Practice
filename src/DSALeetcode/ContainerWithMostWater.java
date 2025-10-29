package DSALeetcode;

public class ContainerWithMostWater {
    public  static  int maxContainer(int nums[]){
        int maxwater = 0;
        int start  = 0; int end = nums.length-1;

        while (start < end){
            if(nums[start] < nums [end]){
                int height = Math.min(nums[start],nums[end]);
                int length = end - start;
                int currwater = height * length;
                maxwater = Math.max(currwater , maxwater);
                start++;
            }else {
                int height = Math.min(nums[start],nums[end]);
                int length = end - start;
                int currwater = height * length;
                maxwater = Math.max(currwater , maxwater);
                end--;
            }
        }

        return  maxwater;
    }
    public static void main(String[] args) {

        int nums[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxContainer(nums));
    }
}
