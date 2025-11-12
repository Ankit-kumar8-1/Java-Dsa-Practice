package DSALeetcode;

public class MinimumNumberofOperationstoMakeAllArrayElementsEqualtoone {
    public  static  int findOperations(int nums[]){
        int preOne = presentOne(nums);
        if(preOne>0){
            return nums.length - preOne;
        }else {
            int minLen = Integer.MAX_VALUE;
            for(int i = 0;i<nums.length ;i++){
                int gcd = nums[i];
                for(int j = i+1 ;j<nums.length;j++){
                    gcd = findGCD(gcd , nums[j]);
                    if(gcd ==1){
                        minLen = Math.min(minLen ,  j-i +1);
                        break;
                    }
                }
            }

            if(minLen == Integer.MAX_VALUE){
                return  -1;
            }

            return (minLen -1) +(nums.length -1);
        }
    }

    public  static  int presentOne(int nums[]){
        int count = 0;

        for(int i = 0 ; i < nums .length;i++){
            if(nums[i] == 1){
                count ++ ;
            }
        }
        return count;
    }

    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
    public static void main(String[] args) {

        int nums[] = {6,10,15};
        System.out.println(findOperations(nums));
    }
}
