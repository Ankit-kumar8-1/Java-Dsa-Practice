package DSALeetcode.SlidingWindow;

import java.util.HashMap;

public class ContainsDuplicateII       {
    public static boolean iscontainsDuplicate(int [] nums, int k ){
        HashMap<Integer,Integer>  rem = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            if(rem.containsKey(nums[i])){
                int idx = rem.get(nums[i]);
                int diff = i -idx;
                if(diff <= k){
                    return  true;
                }
            }
            rem.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3} ;  int k =2;
        System.out.println(iscontainsDuplicate(nums,k));
    }

}
