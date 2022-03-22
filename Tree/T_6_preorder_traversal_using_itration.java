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
  
public class  T_6_preorder_traversal_using_itration {
    static public void itration(Node root){
        Stack<Node> st=new Stack<Node>();
         st.push(root);
         while(!st.isEmpty()){
              Node node=st.pop();
              System.out.print(node.key+" ");
              if(node.right!=null){st.push(node.right);}
                 if(node.left!=null){st.push(node.left);}
                
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

