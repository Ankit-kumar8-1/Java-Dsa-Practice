package DSALeetcode.SlidingWindow;

public class MinimumSizeSubarraySum {
    public static  int minLen(int []nums , int target ){
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;int sum = 0;

        while(right < nums.length){

            sum+=nums[right];

            while(sum >= target){
                minLen = Math.min(minLen , right -left+1);
                sum-=nums[left++];
            }

            right++;
        }
        return minLen == Integer.MAX_VALUE ? -1 :minLen;

    }

    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        System.out.println(minLen(nums,7));
    }
}
