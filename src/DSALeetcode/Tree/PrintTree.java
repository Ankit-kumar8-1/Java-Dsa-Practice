package DSALeetcode.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {

    public static  Node  CreateTree(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        return root;
    }

    public static void  printTree(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);

    }

    public static void main(String[] args) {
        Node root =  CreateTree();
        printTree(root);
    }
}
