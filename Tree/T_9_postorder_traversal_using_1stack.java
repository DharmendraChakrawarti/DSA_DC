import java.util.*;

class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
  
public class  T_9_postorder_traversal_using_1stack{
    static public void itration(Node root){
        Stack<Node> st1 = new Stack<Node>(); 
        if(root == null) System.out.println("null"); 
        
        Node current = root;  
        while(current != null || !st1.isEmpty()) {
            if(current != null){
                st1.push(current);
                current = current.left;
            }else{
                Node temp = st1.peek().right;
                if (temp == null) {
                    temp = st1.pop();
                    System.out.println(temp.key);
                    while (!st1.isEmpty() && temp == st1.peek().right) {
                        temp = st1.pop();
                        System.out.println(temp.key);
                    }
                } else {
                    current = temp;
                }
            }
        }
      
    }


    
	public static void main(String[] args)
	{
	
		/*create root*/
		Node root = new Node(1);

		/* following is the tree after above statement

			1
			/ \
		null null	 */

		root.left = new Node(2);
		root.right = new Node(3);

		/* 2 and 3 become left and right children of 1
			1
			/	 \
		2	 3
		/ \	 / \
	null null null null */


		root.left.left = new Node(4);
		/* 4 becomes left child of 2
					1
				/	 \
			2		 3
			/ \	 / \
			4 null null null
		/ \
		null null
		*/
        itration(root);
	}
}
