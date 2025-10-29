package DSALeetcode;

public class ReverseWordsinaString {
    public  static  String reverseWord(String s){
        s = s.trim();
        StringBuilder sol = new StringBuilder();
        String word[]=s.split("\\s+");
        for (int i = word.length-1;i>=0;i--){
            sol.append(word[i]);
            if(i>0){
                sol.append(" ");
            }
        }

        return sol.toString();
    }

    public static void main(String[] args) {
        String s =" the sky is blue ";
        System.out.println(reverseWord(s));
//        reverseWord(s);
    }
}
