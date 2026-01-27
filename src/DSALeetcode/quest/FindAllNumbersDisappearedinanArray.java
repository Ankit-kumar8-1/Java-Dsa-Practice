package DSALeetcode.quest;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

    public static  List<Integer> findDisappearedNumbers(int[] nums){

        if(nums.length ==0) return null;
        List<Integer> sol = new ArrayList<>();

        int help []= new int[nums.length+1];
        for(int i =0;i<nums.length;i++){
            help[nums[i]]++;
        }

        for(int i =1;i<help.length;i++){
            if(help[i]==0){
                sol.add(i);
            }
        }

        return sol;
    }
    public static void main(String[] args) {
        int nums[]= {1,6,7,8,5,4,4,6,3};
        List<Integer> sol = findDisappearedNumbers(nums);
        System.out.println(sol);
    }
}
