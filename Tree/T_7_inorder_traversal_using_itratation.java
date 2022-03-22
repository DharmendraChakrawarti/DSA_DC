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
  
public class T_7_inorder_traversal_using_itratation{
    static public void travers(Node root){
        Stack<Node> st=new Stack<Node>();
        Node node =root;
         while(true){
             if(node !=null){
                 st.push(node);
                 node =node.left;
             }
             else{
                 if(st.isEmpty())  {
                     break;
                 }  
                 node=st.pop();  
              System.out.print(node.key+" ");
                 node=node.right;
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
        travers(root);
	}
}

