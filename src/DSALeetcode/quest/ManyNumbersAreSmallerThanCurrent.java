package DSALeetcode.quest;

public class ManyNumbersAreSmallerThanCurrent {


    public static  int[] smallerNumbersThanCurrent(int[] nums) {

        int result []= new int[nums.length];


        int k=0;
        for(int i =0;i<nums.length;i++){
            int count =0 ;
            for(int j=0;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            result[k++]=count;
        }

        return result;
    }

    public static  void main(String[] args){
        int nums []= {8,1,2,2,3};

        int arr[]=  smallerNumbersThanCurrent(nums);
        for(int i : arr){
            System.out.println(i);
        }


    }
}
