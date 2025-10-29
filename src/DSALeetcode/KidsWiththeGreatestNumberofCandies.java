package DSALeetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public  static List<Boolean> kidsWithCandies(int []candies, int extracangies){
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            long currcandies = candies[i]+extracangies;
            res.add(helper(currcandies,candies));
        }
        return  res;
    }

    public  static  boolean helper(long currcandies, int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>currcandies){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,5,1,3};int extracandies= 3;
        List<Boolean> sol = kidsWithCandies(arr,extracandies);
        System.out.println(sol);

    }
}
