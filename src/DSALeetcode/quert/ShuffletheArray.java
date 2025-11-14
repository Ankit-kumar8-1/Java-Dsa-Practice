package DSALeetcode.quert;

public class ShuffletheArray {
    public  static  int[]  shuffle(int nums[], int n){
        int i = 0;int j = n;int k = 0;int sol [] = new int[nums.length];

        while (j != nums.length){
            int leftv = nums[i];
            int rightv = nums[j];

            if(i < n && j < nums.length){
                sol[k++]  = leftv;
                sol[k++] = rightv;
            }
            i++;
            j++;
        }
        return sol;
    }

    public static void main(String[] args) {
        int nums[] ={6,3,4,2,8,9};
        int sol [] = shuffle(nums,3);
        for(int i = 0;i<sol.length;i++){
            System.out.print(sol[i]+ " ");
        }
    }
}
