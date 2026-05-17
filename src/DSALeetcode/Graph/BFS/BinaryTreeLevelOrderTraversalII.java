package DSALeetcode.Graph.BFS;

import DSALeetcode.Tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

    public  static List<List<Integer>>  BinaryOrderTraversal2(Node root){
        List<List<Integer>> sol=  new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> levelOrder = new ArrayList<>();

            for (int i = 0;i<size;i++){
                Node curr =  q.remove();
                levelOrder.add(curr.val);

                if (curr.left != null){
                    q.add(curr.left);
                }

                if (curr.right != null){
                    q.add(curr.right);
                }
            }

            sol.addFirst(levelOrder);
        }

        return sol;
    }

    public static void main(String[] args) {
        Node root = BinaryTreeLevelOrderTraversal.createTree();
        List<List<Integer>> result = BinaryOrderTraversal2(root);
        System.out.println(result);
    }
}
