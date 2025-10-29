package DSALeetcode;

public class CanPlaceFlowers {
    public  static  boolean placeFlower(int [] arr, int n){
        int count = n ;
        for(int i=0;i<arr.length ;i++){
            if(arr.length ==1 && arr[i]==0){
                arr[i]=1;
                count--;
            }else if(i==0 && arr[i]==0 && arr[i+1]==0){
                arr[i]=1;
                count--;
            }else if(i==arr.length-1 && arr[i]==0 && arr[i-1]==0){
                arr[i]=1;
                count--;
            }else  if(i>0 && i<arr.length-1 && arr[i]==0 && arr[i+1]==0 && arr[i-1]==0){
                arr[i]=1;
                count--;
            }
            if(count ==0){
                return  true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int arr[]={0}; int n =1;
        System.out.println(placeFlower(arr,n));
    }
}
