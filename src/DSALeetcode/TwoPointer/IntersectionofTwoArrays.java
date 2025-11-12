package DSALeetcode.TwoPointer;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
    public static  int[] intersection(int[] nums1, int[] nums2) {
        int len1 =  nums1.length;
        int len2 = nums2.length;
        Set<Integer> container = new HashSet<>();
        if(len1 < len2){
            return helper(nums1,nums2);
        }else{
            return  helper(nums2,nums1);
        }


    }

    public static int[] helper(int nums1[], int nums2[]){
        Set<Integer> res = new HashSet<>();
        Set<Integer>  container = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            container.add(nums1[i]);
        }

        for(int i =0 ;i <nums2.length;i++){
            if(container.contains(nums2[i])){
                res.add(nums2[i]);
            }

        }

        int result [] = res.stream().mapToInt(x -> x).toArray();

        return result ;
    }

    public static void main(String[] args) {
        int nums1[]={4,6,3} ; int nums2[]={9,8,3,6};
        int arr []= intersection(nums1,nums2);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
