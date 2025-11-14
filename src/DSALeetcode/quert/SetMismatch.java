package DSALeetcode.quert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMismatch {
    public static int[] findErrorMsg(int nums[]){
        Set<Integer> helper = new HashSet<>();int temp = 0; int actualSum = 0;int currsum = 0;
        int res [] = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(helper.contains(nums[i])){
                res[0]=nums[i];
            }
            currsum+=nums[i];
            helper.add(nums[i]);
            temp++;
            actualSum+=temp;

        }

        int missing = actualSum - currsum;
        res[1]=res[0]+missing;
        return res;
    }

    public  static int[] findErrorNums(int[] nums) {
        int freq[]= new int[nums.length+1];
        int sol[] =  new int[2];
        int missing  = 0; int dup = 0;


        for(int i : nums) freq[i]++;
        for(int i = 1 ; i< freq.length;i++){
            if(freq[i] == 2) {
                dup = i;
            }
            if(freq[i] == 0){
                missing = i ;
            }
        }

        sol[0]=dup;
        sol[1]= missing;
        return sol;

    }

    public static void main(String[] args) {
        int  arr[] = {1,2,2,3};
        System.out.println(findErrorMsg(arr));

        int sol[]= findErrorNums(arr);
        for(int i = 0;i< sol.length;i++){
            System.out.print(sol[i] +" ");
        }

    }
}
