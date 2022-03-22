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
  
public class  T_8_postorder_travesal_using_itraation_2stack{
    static public void itration(Node root){
        Stack<Node> st1=new Stack<Node>();
        Stack<Node> st2=new Stack<Node>();
         st1.push(root);
         while(!st1.isEmpty()){
              Node node=st1.pop();
              st2.push(node);
              if(node.left!=null){st1.push(node.left);}
              if(node.right!=null){st1.push(node.right);}
                
             }
            while(!st2.isEmpty()){
                int l=st2.pop().key;
                System.out.print(l+ " ");
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
