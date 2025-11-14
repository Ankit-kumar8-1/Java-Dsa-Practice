package DSALeetcode.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public static List<Integer> findclosedtE(int nums[], int k, int x) {
        int left = 0;
        int right = nums.length - 1;

        while (right - left + 1 > k) {
            if (Math.abs(nums[left] - x) > Math.abs(nums[right] - x)) {
                left++;
            } else {
                right--;
            }

        }
        List<Integer> sol = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            sol.add(nums[i]);
        }

        return sol;


    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        System.out.println(findclosedtE(nums,4,3));
    }
}
