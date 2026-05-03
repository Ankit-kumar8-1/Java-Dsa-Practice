package Graph;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Second  {

    public  static  void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0 ;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2,2));
        graph[2].add(new Edge(2,3,-1));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,0,2));
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));
        graph[3].add(new Edge(3,2,-1));
        graph[3].add(new Edge(3,1,0));
    }

    public static void main(String[] args) {
        int vertex = 4;
        ArrayList<Edge> graph[]= new ArrayList[vertex];
        createGraph(graph);

        for (int i = 0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println("source"+ e.src+", destination : "+ e.dest +", weight : "+ e.wt);
        }
    }
}
