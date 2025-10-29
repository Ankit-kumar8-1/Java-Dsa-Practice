package DSALeetcode;

public class MergeStringsAlternately {
    public  static  String solution(String word1,String word2){
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0,j=0;StringBuilder res = new StringBuilder();

        while (i<len1 || j<len2){
            if(i<len1){
                res.append(word1.charAt(i));
                i++;
            }
            if(j<len2){
                res.append(word2.charAt(j));
                j++;
            }
        }
        return  res.toString();
    }
    public  static  String optimzetry(String word1,String word2){
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0,j=0;String str = "";int idx =0;

        while (i<len1 || j<len2){
            if(i<len1){
                str+=word1.charAt(i);
                i++;
            }
            if(j<len2){
                str+=word2.charAt(j);
                j++;
            }
        }
        return  str;
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "pqr";
        System.out.println(optimzetry(str1,str2));
    }
}
