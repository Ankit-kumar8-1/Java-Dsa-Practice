package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {




    public  static  void bfs(ArrayList<Edge> graph[], boolean visited[],int start){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        while (!queue.isEmpty()){
            int curr =  queue.remove();

            if (visited[curr] == false){
                System.out.println(curr + " ");
                visited[curr] = true;
                for (int i = 0;i< graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertex = 7 ;
        CreateGraph createGraph = new CreateGraph();

        ArrayList<Edge> graph[] =  new ArrayList[vertex];

        createGraph.createGraph(graph);
        boolean visited[] = new boolean[vertex];

        for(int  i = 0 ;i< vertex;i++){
            if (visited[i]==false){
                bfs(graph,visited,i);
            }
        }




    }
}
