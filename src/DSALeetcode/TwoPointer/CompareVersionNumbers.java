package DSALeetcode.TwoPointer;

public class CompareVersionNumbers {
    public static int compareVer(String v1 , String v2){
        String [] str1 = v1.split("\\.");
        String [] str2 =v2.split("\\.");

        int maxLen = Math.max(str1.length ,str2.length);

        for(int i =0 ;i<maxLen ;i++){
            int nums1 = i < str1.length ? Integer.parseInt(str1[i]) : 0;
            int nums2 = i < str2.length ? Integer.parseInt(str2[i]) : 0 ;

            if(nums1 > nums2) return  1;
            if(nums2 > nums1 )  return  -1;
        }

        return  0;
    }

    public static void main(String[] args) {

    }
}
