
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
  
public class T_4_postorder_Traversal_of_Binary_Tree {
    static public void postorder(Node root){
		if(root == null){return;}
		
		postorder(root.left);
        
		postorder(root.right);

        System.out.println(root.key);
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
			 2         3
			/ \	      / \
		   4 null  null null
		  / \
		null null
		*/
        postorder(root);
	}
}


