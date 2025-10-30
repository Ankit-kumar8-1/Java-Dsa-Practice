package DSALeetcode;

public class MaximumAverageSubarrayI {
    public  static  double maxAverage(int nums[] , int k){
        double  sum = 0;double avg = 0.0;double ans =0.0;

        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }

        avg = sum *1.0 /k;
        ans =avg;

        for(int i = k ;i<nums.length;i++){
            sum+= nums[i]  - nums[i-k];
            avg = sum * 1.0 /k;
            ans =  Math.max(avg,ans);
        }

        return  ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,12,-5,-6,50,3}  ;int k =4;
        System.out.println(maxAverage(arr,k));
    }
}
