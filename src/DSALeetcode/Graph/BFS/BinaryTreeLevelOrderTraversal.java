package DSALeetcode.Graph.BFS;

import DSALeetcode.Tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {


    public  static  Node createTree(){
        Node root = new Node(3);
        root.left =  new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right =  new Node(7);

        return root;
    }

    public  static  List<List<Integer>> traversal(Node root){
        List<List<Integer>> sol = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currLevel = new ArrayList<>();

            for (int i = 0 ;i< size;i++){
                Node curr = queue.remove();
                currLevel.add(curr.val);

                if (curr.left != null){
                    queue.add(curr.left);
                }
                if (curr.right != null){
                    queue.add(curr.right);
                }
            }
            sol.add(currLevel);
        }

        return sol;
     }

    public static void main(String[] args) {
        Node root = createTree();
        List<List<Integer>> traversal = traversal(root);
        System.out.println(traversal);
    }
}
