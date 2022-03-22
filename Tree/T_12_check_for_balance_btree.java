
import java.lang.Math;

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
public class T_12_check_for_balance_btree{
    static public int balance(Node root){
      if(root==null){return 0;}
      int lh=balance(root.left);
      int rh=balance(root.right);
      if(lh==-1||rh==-1){return -1;}
      if(Math.abs(lh-rh)>1)return -1;
      return Math.max(lh, rh)+1;
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
        if(balance(root)==-1)System.out.print("not a balance");
        else
        System.out.print(" balance");
	}
}
