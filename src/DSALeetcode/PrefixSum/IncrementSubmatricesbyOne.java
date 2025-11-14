package DSALeetcode.PrefixSum;

public class IncrementSubmatricesbyOne {
    public static  int[][] rangeAddQuries(int n , int[][] queries){
        int [][] diff = new int[n+1][n+1];

        for(int []q : queries){
            int r1 = q[0];
            int c1 = q[1];
            int r2 = q[2];
            int c2 = q[3];

            diff[r1][c1]+=1;

            if(c2+1 < n){
                diff[r1][c2+1]-=1;
            }
            if(r2+1 < n){
                diff[r2+1][c1] -=1;
            }

            if(c2+1 < n && r2+1 <n){
                diff[r2+1][c2+1]+=1;
            }
        }

        int [][] res= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                int top = i>0 ?res[i-1][j] : 0;
                int left = j>0 ? res[i][j-1] : 0;
                int diag = i>0 && j>0 ? res[i-1][j-1] : 0;

                res[i][j] = diff[i][j]+top+left-diag;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        int [][] queries = {
                {0,0,1,1},
                {1,1,2,2}
        };

        int ans[][]= rangeAddQuries(n,queries);
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
