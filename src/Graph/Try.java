package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Try {


    public  static  void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean vis[]= new boolean[graph.length];

        while (!queue.isEmpty()){
            int curr = queue.remove();

            if (vis[curr]==false){
                System.out.println(curr+" ");
                vis[curr]=true;

                for (int i = 0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }


    public  static  void bfs2(ArrayList<Edge> graph[],boolean vis[],int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()){
            int curr = queue.remove();

            if (vis[curr]==false){
                System.out.println(curr +" ");
                vis[curr] =true;
                for (int i  =0 ;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }


    public  static  void dfs(ArrayList<Edge> graph[] , int curr ,boolean []visited){  //O(V+E)
        System.out.println(curr + " ");
        visited[curr] =true;

        for (int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (visited[e.dest] == false){
                dfs(graph,e.dest,visited);
            }
        }
    }

//    O(V^V)
    public static  void  findAllPath(ArrayList<Edge> graph[], boolean vis[],int curr , String path, int target){

        if (curr == target){
            System.out.println(path);
            return;
        }
        for (int i = 0 ;i< graph[curr].size();i++){
            Edge  e = graph[curr].get(i);
            if (!vis[e.dest]){
                vis[curr] = true;
                findAllPath(graph,vis,e.dest,path+e.dest,target);
                vis[curr]=false;
            }
        }
    }


    public static void main(String[] args) {
        CreateGraph createGraph = new CreateGraph();
        int vertix =7;
        ArrayList<Edge> graph[]= new ArrayList[vertix];
        boolean vis[] = new boolean[vertix];
        createGraph.createGraph(graph);

//        //        bfs(graph);

//        bfs 2
//        for (int i = 0;i<vertix;i++){
//            if (vis[i]==false){
//                bfs2(graph,vis,i);
//            }
//        }

//        dfs(graph,0,vis);
        findAllPath(graph,vis,0,"0",5);
    }
}
