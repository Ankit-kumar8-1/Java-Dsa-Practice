package DSALeetcode.Graph.BFS;


import DSALeetcode.Tree.Node;

public class IsSymmetric {

    public static Node createNode(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left =  new Node(3);
        root.left.right = new Node(4);
        root.right= new Node(2);
        root.right.right = new Node(3);
        root.right.left= new Node(4);

        return  root;
    }

    public  static boolean  isSymmetric(Node root){
        return  isMirror(root.left,root.right);
    }


    private static  boolean isMirror(Node left , Node  right){
        if (left == null && right == null){
            return true;
        }

        if (left ==null || right == null){
            return  false;
        }

        if (left.val != right.val){
            return  false;
        }

        return isMirror(left.left, right.right) && isMirror(left.right,right.left);
    }


    public static void main(String[] args) {
        Node root = createNode();
        boolean resultIsSymmetric = isSymmetric(root);
        System.out.println(resultIsSymmetric);
    }
}
