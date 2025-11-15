package DSALeetcode.PrefixSum;

public class CounttheNumberofSubstringsWithDominantOnes {
    public static int numberofvalidstring(String s){
        int left= 0;
        int sol = 0;

        while (left != s.length()){
            int right = left;

            while (right < s.length()){

                String currSubString = s.substring(left,right+1);
                int zeros= 0;
                int onces = 0;

                for (int i =0 ;i<currSubString.length();i++){
                    if(currSubString.charAt(i)=='1') onces++;
                    else zeros++;
                }

                if(onces >= zeros * zeros){
                    sol++;
                }

                right++;
            }
            left++;
        }
        return sol;
    }

    public static void main(String[] args) {
        String s = "00011";
        System.out.println(numberofvalidstring(s));
    }
}
