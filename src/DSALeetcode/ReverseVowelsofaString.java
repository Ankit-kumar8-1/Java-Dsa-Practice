package DSALeetcode;

import java.util.*;

public class ReverseVowelsofaString {
    public  static  String reverseVovel(String s){
        char sarr[]=s.toCharArray();
        Set<Character> vovels =  new HashSet<>(Arrays.asList('a','A','I','i','E','e','O','o','U','u'));
        int i=0;int j=sarr.length-1;
        while (i<=j){
            if(vovels.contains(sarr[i]) && vovels.contains(sarr[j])){
                char temp = sarr[i];
                sarr[i]=sarr[j];
                sarr[j]=temp;
                i++;
                j--;
            }else if(vovels.contains(sarr[i])){
                j--;
            }else {
                i++;
            }
        }
        return  new String(sarr);
    }
    public  static  String reverseVovelOptimze(String s){
        char sarr[]=s.toCharArray();
        Set<Character> vowels =  new HashSet<>(Arrays.asList('a','A','I','i','E','e','O','o','U','u'));
        int i=0;int j=sarr.length-1;
        while (i<=j){
            while (i < j && !vowels.contains(sarr[i])) {
                i++;
            }

            while (i < j && !vowels.contains(sarr[j])) {
                j--;
            }

            if (i < j) {
                char temp = sarr[i];
                sarr[i] = sarr[j];
                sarr[j] = temp;
                i++;
                j--;
            }
        }
        return  new String(sarr);
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVovel(s));
    }
}
