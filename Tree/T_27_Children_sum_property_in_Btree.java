

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
public class T_27_Children_sum_property_in_Btree{
    static public void sum(Node root){
     if(root==null){return;}
     int sum = 0;
     if(root.left!=null){ sum+=root.left.key;}
     if(root.right!=null){ sum+=root.right.key;}
     if(sum>=root.key){ root.key=sum;}
     else{
         if(root.left!=null){ root.left.key=root.key;}
     else if(root.right!=null){ root.right.key=root.key;}
     }
     sum(root.left);
     sum(root.right);
     int tut=0;
     if(root.left!=null){ tut+=root.left.key;}
     if(root.right!=null){ tut+=root.right.key;}
     if(root.left!=null||root.right!=null){ root.key=tut;}

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
