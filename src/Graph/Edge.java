package Graph;

public class Edge {
    int src;
    int dest;
    int wt;

    Edge(int src, int dest, int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }

    Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
    }
}
