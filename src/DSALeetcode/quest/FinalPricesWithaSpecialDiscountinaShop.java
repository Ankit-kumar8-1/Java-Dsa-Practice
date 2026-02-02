package DSALeetcode.quest;




class FinalPricesWithaSpecialDiscountinaShop {

    static public int[] finalPrices(int[] prices){
        int sol[]= new int[prices.length];
        int k =0;

        for(int i =0;i<prices.length;i++){
            int diff = Integer.MIN_VALUE;

            if(i<prices.length-1){
                for (int j =i+1;j<prices.length;j++){
                    if(prices[i]>prices[j]){
                        diff = prices[i]-prices[j];
                        break;
                    }
                }
            }

            if(diff != Integer.MIN_VALUE){
                sol[k++]=diff;
            }else {
                sol[k++]=prices[i];
            }
        }

        return sol;
    }
    public  static void  main(String[] args){
        int num []= {8,4,6,2,3};
        int arr[]= finalPrices(num);
        for(int i: arr){
            System.out.println(i);
        }
    }
}

