package DSALeetcode;

import java.util.Arrays;

public class MaxNumberofKSumPairs {
    public  static  int findOperations(int nums[], int k){
        int operation =0;
        Arrays.sort(nums);

        int i =0;int j=nums.length-1;

        while (i<j){
            if(nums[i]+nums[j] == k){
                operation++;
                i++;j--;
            } else if (nums[i]+nums[j] < k) {
                i++;
            }else{
                j--;
            }
        }

        return  operation;
    }
    public static void main(String[] args) {

        int nums[] = {4,4,1,3,4,5,1,3,6,7,3,4}; int k =2;
        System.out.println(findOperations(nums,k));
    }

}
