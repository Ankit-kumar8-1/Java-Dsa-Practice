package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class MatrixBfs {


    public  static void traverse(int [][]grid){
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int []> q = new LinkedList<>();
        boolean [][] visited = new boolean[rows][cols];
        int [][] dir = {
                {-1,0},
                {1,0},
                {0,-1},
                {0,1}
        };
        q.add(new int[]{0,0});
        visited[0][0] = true;

        while (!q.isEmpty()){
            int temp[] = q.poll();
            int r = temp[0];
            int c = temp[1];

            System.out.println(
                    "Visited: " + grid[r][c]
            );

            for (int d[] : dir){
                int nr = r + d[0];
                int nc = c + d[1];


                if (nr >= 0 && nc >= 0 && nr<rows && nc < cols && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    q.offer(new int[]{nr,nc});
                }
            }
        }

    }
    public static void main(String[] args) {

        int grid[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        traverse(grid);
    }
}
