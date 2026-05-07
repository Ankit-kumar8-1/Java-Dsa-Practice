package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {

    public  static void dfs(ArrayList<Edge> graph[], int start, boolean visited[]){

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()){
            int curr = queue.remove();
            if (visited[curr]==false){
                System.out.println(curr);
                visited[curr]= true;

                for (int i = 0; i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    dfs(graph,e.dest,visited);
                }
            }
        }

    }

    public static void main(String[] args) {
        CreateGraph createGraph = new CreateGraph();
        int vertix = 7;
        ArrayList<Edge> graph[] = new ArrayList[vertix];
        boolean visited[] = new boolean[vertix];
        int start = 0;
        createGraph.createGraph(graph);

        dfs(graph,0,visited);




    }
}
