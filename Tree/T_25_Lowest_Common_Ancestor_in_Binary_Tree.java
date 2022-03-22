;

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
  
class pair{
    int num ;
    Node node;
    pair(Node _node, int val){
        num=val;
        node =_node;
    }
}
public class T_25_Lowest_Common_Ancestor_in_Binary_Tree{
    static public Node Ancensor(Node root,Node y,Node x){
      if(root==null||root==y||root==x){return root;}
     Node left=Ancensor(root.left,y,x);
	 Node right=Ancensor(root.right,y,x);
     if(left==null)return right;
	 else if(right==null)return left;
	 else return root;
     
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
     
        //  System.out.println(it);
     }
}
