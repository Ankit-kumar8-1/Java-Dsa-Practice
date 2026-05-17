package DSALeetcode.Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {

    public  static  Node connect(Node root){
        if (root == null){
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            int size = q.size();

            for (int i = 0;i<size;i++){
                Node currPeak = q.peek();
                if (i<size-1){
                    Node curr = q.remove();
                    curr.next= q.peek();
                }
                assert currPeak != null ;
                if (currPeak.left != null){
                    q.add(currPeak.left);
                }

                if (currPeak.right !=null){
                    q.add(currPeak.right);
                }
            }
            Node lastNode = q.remove();
            lastNode.next = null;
        }
        return root;
    }


//    Optimize Solution

    public  static  Node optimizeConnect(Node root){

        if (root == null){
            return null;
        }
        Node startLevel = root;
        while (startLevel.left!=null){
            Node curr = startLevel;

            while (curr!= null){
                curr.left.next = curr.right;

                if (curr.next != null){
                    curr.right.next = curr.next.left;
                }

                curr= curr.next;
            }

            startLevel = startLevel.left;
        }

        return root;
    }
    public static void main(String[] args) {
        // Creating Nodes
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);


    }
}


class Node {
    int val;
    Node left;
    Node right;
    Node next;

    Node(int val) {
        this.val = val;
    }


}