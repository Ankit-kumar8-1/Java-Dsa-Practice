package DSALeetcode;

public class IsSubsequence {
    public  static  boolean issubsequence(String s, String t){
        int i =0;int j=0;
        while (j<t.length() && i<s.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }


        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "abdgrc";
        System.out.println(issubsequence(s,t));

    }
}
