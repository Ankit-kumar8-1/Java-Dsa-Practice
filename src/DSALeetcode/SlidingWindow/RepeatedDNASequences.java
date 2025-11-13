package DSALeetcode.SlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
    public  static List<String> findDNASequence(String s){
        Set<String> seen =  new HashSet<>();
        Set<String> res = new HashSet<>();

        for(int i =0 ;i+10 <= s.length();i++){
            String subString = s.substring(i,i+10);
            if(!seen.add(subString)){
                res.add(subString);
            }
        }
        return new ArrayList<>(res);
    }
    public static void main(String[] args) {
        String s ="AAAAAAAAAAA";
        System.out.println(findDNASequence(s));
    }
}
