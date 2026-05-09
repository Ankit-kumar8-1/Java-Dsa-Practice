package DSALeetcode.Tree;

import Graph.Edge;

import java.util.LinkedList;
import java.util.Queue;

public class Node {

    public  Node left;
    public  Node right;
    public  int val ;

    public Node(){};
    public  Node(int val){
        this.val =val;
    }

    public Node(Node left , Node right, int val){
        this.left =left;
        this.right=right;
        this.val=val;
    }

}
