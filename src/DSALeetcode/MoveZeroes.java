package DSALeetcode;

public class MoveZeroes {
    public  static int[] movezeros(int arr[]){
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[idx] = arr[i];
                idx++;
            }
        }

        while (idx< arr.length){
            arr[idx++]=0;
        }
        return  arr;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,5,11};
        int res[]= movezeros(arr);
        for(int i : res){
            System.out.print(" "+i);
        }
    }
}
