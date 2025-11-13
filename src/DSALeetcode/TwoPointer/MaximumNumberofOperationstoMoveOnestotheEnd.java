package DSALeetcode.TwoPointer;

public class MaximumNumberofOperationstoMoveOnestotheEnd {
    public static  int Operation(String s){
        int ones = 0;
        int res = 0;

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) =='1'){
                ones++;
            }else if(i>0 && s.charAt(i-1) == '1'){
                res+=ones;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s= "1001101";
        System.out.println(Operation(s));
    }
}
