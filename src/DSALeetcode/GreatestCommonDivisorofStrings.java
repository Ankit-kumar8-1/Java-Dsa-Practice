package DSALeetcode;

public class GreatestCommonDivisorofStrings {
    public  static String solution(String str1 , String str2){
        if((str1+str2).equals(str2+str1)){
            int n = str1.length();
            int m = str2.length();
            int gcd = GCD(n,m);
            return str1.substring(0,gcd);
        }else {
            return "";
        }
    }

    public static int GCD(int a , int b){
        while (b%a!=0){
            int rem=b%a;
            b=a;
            a=rem;
        }
        return a;
    }
    public static void main(String[] args) {
        String s="ABABAB";
        String s2 ="ABAB";

        System.out.println(solution(s,s2));
    }
}
