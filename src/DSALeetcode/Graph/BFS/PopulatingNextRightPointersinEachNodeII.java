package DSALeetcode.Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNodeII {

    public  static  Node connect(Node root){
        Queue<Node> q =  new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            int size =q.size();

            for (int i = 0 ;i< size;i++){
                Node curr = q.remove();

                if (i<size-1){
                    curr.next = q.peek();
                }

                if (curr.left !=null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return root;
    }

//    public  static  Node optimizeConnect(
//
//    )
}
