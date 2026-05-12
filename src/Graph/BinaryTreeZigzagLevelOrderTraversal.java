package Graph;

import DSALeetcode.Graph.BFS.BinaryTreeLevelOrderTraversal;
import DSALeetcode.Tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {



    public static  List<List<Integer>> printTreeZigzag(Node root){
        List<List<Integer>> sol = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Long zigzagPattern = 1l;

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i< size ;i++){
                Node curr = queue.remove();
                level.add(curr.val);

                if (zigzagPattern%2 ==0){
                    zigzagPattern++;
                    if (curr.left != null){
                        queue.add(curr.left);
                    }

                    if (curr.right != null ){
                        queue.add(curr.right);
                    }

                }else {
                    zigzagPattern++;
                    if (curr.right != null){
                        queue.add(curr.right);
                    }

                    if (curr.left != null ){
                        queue.add(curr.left);
                    }

                }

            }

            sol.add(level);
        }
        return sol;
    }
    public static void main(String[] args) {
        Node root = BinaryTreeLevelOrderTraversal.createTree();

        List<List<Integer>> result = printTreeZigzag(root);
        System.out.println(result);
    }
}
