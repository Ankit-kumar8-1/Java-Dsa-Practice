package Graph;

import java.util.ArrayList;

public class First {


    public static void createGraph(ArrayList<Edge> graph[]){

//        for(int i = 0; i< graph.length;i++){
//            graph[i]=new ArrayList<>();
//        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,0));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));
    }

    public static void main(String[] args) {

        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);

        for (int i =0 ;i< graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println("neighbour : "+ e.dest);
        }
        System.out.println("Program is ending ");
    }
}
