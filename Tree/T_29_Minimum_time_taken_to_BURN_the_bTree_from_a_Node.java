
import java.util.*;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class pair {
    int num;
    Node node;

    pair(Node _node, int val) {
        num = val;
        node = _node;
    }
}

public class T_29_Minimum_time_taken_to_BURN_the_bTree_from_a_Node {
    static private Node markParents(Node root, Map<Node, Node> parent_track, int target) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        Node dc = new Node(-1);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.key == target)
                dc = current;
            if (current.left != null) {
                parent_track.put(current.left, current);
                queue.offer(current.left);
            }
            if (current.right != null) {
                parent_track.put(current.right, current);
                queue.offer(current.right);
            }
        }
        return dc;
    }

    static public int distanceK(Node root, int k) {
        Map<Node, Node> parent_track = new HashMap<>();
        Node target = markParents(root, parent_track, k);
        Map<Node, Boolean> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<Node>();
        int maxi = 0;
        queue.offer(target);
        visited.put(target, true);
        while (!queue.isEmpty()) { /*
                                    * Second BFS to go upto K level from target node and using our hashtable info
                                    */
            int size = queue.size();
            int f = 0;
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (current.left != null && visited.get(current.left) == null) {
                    queue.offer(current.left);
                    visited.put(current.left, true);
                    f = 1;
                }
                if (current.right != null && visited.get(current.right) == null) {
                    queue.offer(current.right);
                    visited.put(current.right, true);
                    f = 1;
                }
                if (parent_track.get(current) != null && visited.get(parent_track.get(current)) == null) {
                    queue.offer(parent_track.get(current));
                    visited.put(parent_track.get(current), true);
                    f = 1;
                }
            }
            if (f == 1)
                maxi++;
        }
        return maxi;
    }

    public static void main(String[] args) {

        /* create root */
        Node root = new Node(1);

        /*
         * following is the tree after above statement
         * 
         * 1
         * / \
         * null null
         */

        root.left = new Node(2);
        root.right = new Node(3);

        /*
         * 2 and 3 become left and right children of 1
         * 1
         * / \
         * 2 3
         * / \ / \
         * null null null null
         */

        root.left.left = new Node(4);
        /*
         * 4 becomes left child of 2
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 null null null
         * / \
         * null null
         */

        System.out.println(distanceK(root, 2));
    }
}
