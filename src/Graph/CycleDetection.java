package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CycleDetection {

     public  static  void createGraph(ArrayList<Edge> graph[]){
         for (int i = 0;i<graph.length;i++){
             graph[i] = new ArrayList<>();
         }
         graph[0].add(new Edge(0,2));
         graph[1].add(new Edge(1,0));
         graph[2].add(new Edge(2,3));
         graph[3].add(new Edge(3,0));
     }

     public static  boolean cycleDetect(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]){
         vis[curr]=  true;
         rec[curr] =true;

         for (int i = 0;i<graph[curr].size();i++){
             Edge e = graph[curr].get(i);
             if (rec[e.dest]){
                 return true;
             } else if (!vis[e.dest]) {
                 if (cycleDetect(graph,vis,e.dest,rec)){
                     return  true;
                 }
             }
         }

         rec[curr] = false;
         return false;
     }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
         createGraph(graph);

         boolean result = cycleDetect(graph,new boolean[4],0,new boolean[4]);
        System.out.println(result);


    }
}
