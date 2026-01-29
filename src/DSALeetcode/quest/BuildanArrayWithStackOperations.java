package DSALeetcode.quest;

import java.util.ArrayList;
import java.util.List;

public class BuildanArrayWithStackOperations {

    public static  List<String> buildArray(int[] target, int n) {
        List<String> sol = new ArrayList<>();

        int j = 0;
        for(int i =1;i<=n;i++){

            if(j == target.length){
                break;
            }
            sol.add("push");
            if(target[j]==i){
                j++;
            }else {
                sol.add("Pop");
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int target[]={1,2};
        List<String> sol = buildArray(target,4);
        System.out.println(sol);
    }
}
