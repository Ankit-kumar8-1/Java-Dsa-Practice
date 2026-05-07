package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AllPathsFromSrcToDest {

    public  static  void getAllPath(ArrayList<Edge> graph[] ,boolean visited[],  int curr, String path,int target){
        if (curr == target){
            System.out.println(path);
            return;
        }


        for (int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if (!visited[e.dest]){
                visited[curr]=true;
                getAllPath(graph,visited,e.dest,path+e.dest,target);
                visited[curr]= false;
            }
        }
    }

    public static void main(String[] args) {
        int vertix =7;
        ArrayList<Edge> graph[] = new ArrayList[vertix];
        CreateGraph createGraph = new CreateGraph();
        boolean visited[]= new boolean[vertix];
        createGraph.createGraph(graph);

        getAllPath(graph,visited,0,"0",5);
    }
}
