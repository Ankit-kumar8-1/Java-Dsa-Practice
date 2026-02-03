package DSALeetcode.quest;

import DSALeetcode.TwoPointer.SortList;

import java.util.Stack;

public class DailyTemperatures {
    static  public int[] dailyTemperatures(int[] temperatures){
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr[]= {73,74,75,71,69,72,76,73};
        int sol[]= dailyTemperatures(arr);

        for (int i : sol){
            System.out.println(i);
        }
    }
}
